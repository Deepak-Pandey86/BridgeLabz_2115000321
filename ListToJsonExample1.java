public class Student {
    private String name;
    private int age;
    private String course;


    // Constructor
    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }


    // Getters (Jackson requires these to serialize the object)
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getCourse() { return course; }
}





import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;


public class ListToJsonExample1 {
    public static void main(String[] args) {
        try {
            // Create a list of Student objects
            List<Student> students = Arrays.asList(
                new Student("Alice", 22, "Computer Science"),
                new Student("Bob", 24, "Mechanical Engineering"),
                new Student("Charlie", 21, "Physics")
            );


            // Convert List to JSON Array using Jackson
            ObjectMapper objectMapper = new ObjectMapper();
            String jsonArray = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(students);


            // Print JSON output
            System.out.println(jsonArray);


            // Save JSON array to a file
            objectMapper.writeValue(new File("students.json"), students);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
