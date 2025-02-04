class Student {
    private static String universityName = "Global University";
    private static int totalStudents = 0;
    private String name;
    private final int rollNumber;
    private double grade;

    public Student(String name, int rollNumber, double grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
        }
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    public void updateGrade(double newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
            System.out.println("Updated Grade for " + name + ": " + grade);
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Alice", 101, 3.8);
        Student s2 = new Student("Bob", 102, 3.5);

        s1.displayStudentDetails();
        s2.displayStudentDetails();

        Student.displayTotalStudents();

        s1.updateGrade(3.9);
        s1.displayStudentDetails();
    }
}
