// Base class: Student
class Student {
    public int rollNumber;   // Public: Can be accessed anywhere
    protected String name;   // Protected: Accessible in subclasses
    private double CGPA;     // Private: Only accessible within this class

    // Constructor
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Getter for CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Setter for CGPA
    public void setCGPA(double CGPA) {
        if (CGPA >= 0.0 && CGPA <= 10.0) {  // Ensuring valid CGPA range
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA value! Must be between 0.0 and 10.0.");
        }
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

// Subclass: PostgraduateStudent (demonstrating protected access)
class PostgraduateStudent extends Student {
    private String researchTopic;

    // Constructor
    public PostgraduateStudent(int rollNumber, String name, double CGPA, String researchTopic) {
        super(rollNumber, name, CGPA);  // Calling parent constructor
        this.researchTopic = researchTopic;
    }

    // Method to display postgraduate student details
    public void displayPostgraduateDetails() {
        displayDetails();  // Calling parent method
        System.out.println("Research Topic: " + researchTopic);
    }
}

// Main class
public class UniversityManagement {
    public static void main(String[] args) {
        // Creating a Student object
        Student student1 = new Student(101, "Alice", 8.5);
        student1.displayDetails();

        // Modifying CGPA using setter
        student1.setCGPA(9.2);
        System.out.println("Updated CGPA: " + student1.getCGPA());

        System.out.println("\n------------------\n");

        // Creating a PostgraduateStudent object
        PostgraduateStudent pgStudent = new PostgraduateStudent(202, "Bob", 9.0, "Artificial Intelligence");
        pgStudent.displayPostgraduateDetails();
    }
}
