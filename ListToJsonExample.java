import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.util.Arrays;
import java.util.List;


class Student {
    private String name;
    private int age;
    private List<String> subjects;


    public Student(String name, int age, List<String> subjects) {
        this.name = name;
        this.age = age;
        this.subjects = subjects;
    }


    // Getters (required for Jackson to serialize properly)
    public String getName() { return name; }
    public int getAge() { return age; }
    public List<String> getSubjects() { return subjects; }
}





public class ListToJsonExample {
    public static void main(String[] args) throws JsonProcessingException {
        // Create a list of students
        List<Student> students = Arrays.asList(
            new Student("Alice", 22, Arrays.asList("Math", "Science")),
            new Student("Bob", 21, Arrays.asList("History", "Geography")),
            new Student("Charlie", 23, Arrays.asList("Physics", "Chemistry"))
        );


        // Convert list to JSON
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT); // Pretty print JSON
        String jsonArray = objectMapper.writeValueAsString(students);


        // Print JSON output
        System.out.println(jsonArray);
    }
}


