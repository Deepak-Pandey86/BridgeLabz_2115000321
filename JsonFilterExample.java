import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;


class Student {
    private String name;
    private int age;
    private List<String> subjects;


    // Getters & Constructors (needed for Jackson)
    public String getName() { return name; }
    public int getAge() { return age; }
    public List<String> getSubjects() { return subjects; }
}


public class JsonFilterExample {
    public static void main(String[] args) {
        try {
            // Initialize ObjectMapper
            ObjectMapper objectMapper = new ObjectMapper();


            // Read JSON file into List<Student>
            List<Student> students = objectMapper.readValue(
                new File("students.json"), new TypeReference<List<Student>>() {}
            );


            // Filter students where age > 25
            List<Student> filteredStudents = students.stream()
                    .filter(student -> student.getAge() > 25)
                    .collect(Collectors.toList());


            // Print filtered students
            System.out.println("Students with age > 25:");
            filteredStudents.forEach(student ->
                System.out.println(student.getName() + " - Age: " + student.getAge())
            );


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
