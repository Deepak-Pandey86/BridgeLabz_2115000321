import java.io.*;
import java.util.*;


class Student {
    private int id;
    private String name;
    private int age;
    private double marks;


    public Student(int id, String name, int age, double marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }


    @Override
    public String toString() {
        return "Student{ ID=" + id + ", Name='" + name + "', Age=" + age + ", Marks=" + marks + " }";
    }
}


public class CSVToStudentList {
    public static void main(String[] args) {
        String inputFile = "students.csv";
        List<Student> students = new ArrayList<>();


        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String line;
            boolean isHeader = true;


            while ((line = br.readLine()) != null) {
                if (isHeader) { 
                    isHeader = false; // Skip the header row
                    continue;
                }


                String[] fields = line.split(",");
                if (fields.length != 4) continue; // Skip invalid rows


                int id = Integer.parseInt(fields[0].trim());
                String name = fields[1].trim();
                int age = Integer.parseInt(fields[2].trim());
                double marks = Double.parseDouble(fields[3].trim());


                students.add(new Student(id, name, age, marks));
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }


        // Print all Student objects
        System.out.println("Student List:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
