import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;


class User {
    private String name;
    private int age;
    private String email;


    // Getters (Jackson requires these for deserialization)
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getEmail() { return email; }
}


public class FilterJsonData {
    public static void main(String[] args) {
        try {
            // Initialize ObjectMapper
            ObjectMapper objectMapper = new ObjectMapper();


            // Read JSON file into a List of Users
            List<User> users = objectMapper.readValue(new File("users.json"), new TypeReference<List<User>>() {});


            // Filter users older than 25
            List<User> filteredUsers = users.stream()
                                            .filter(user -> user.getAge() > 25)
                                            .collect(Collectors.toList());


            // Print filtered users
            System.out.println("Users older than 25:");
            filteredUsers.forEach(user -> 
                System.out.println(user.getName() + " (Age: " + user.getAge() + ", Email: " + user.getEmail() + ")")
            );


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
