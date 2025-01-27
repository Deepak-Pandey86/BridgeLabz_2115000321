import java.util.Scanner;

public class StudentGrades9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // 2D array to store marks for each subject
        int[][] marks = new int[numStudents][3]; // 0: Physics, 1: Chemistry, 2: Maths
        double[] percentages = new double[numStudents];
        String[] grades = new String[numStudents];

        // Input marks for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");

            marks[i][0] = getValidMarks(scanner, "Physics");
            marks[i][1] = getValidMarks(scanner, "Chemistry");
            marks[i][2] = getValidMarks(scanner, "Maths");

            // Calculate percentage
            percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            // Determine grade
            grades[i] = calculateGrade(percentages[i]);
        }

        // Display results
        System.out.println("\nStudent Results:");
        System.out.println("------------------------------------------");
        System.out.println("Student\tPhysics\tChemistry\tMaths\tPercentage\tGrade");

        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%d\t\t%d\t\t%d\t\t%d\t\t%.2f%%\t\t%s\n",
                    (i + 1), marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }
    }

    // Method to get valid marks input
    private static int getValidMarks(Scanner scanner, String subject) {
        int marks;
        while (true) {
            System.out.print(subject + " marks (0-100): ");
            marks = scanner.nextInt();
            if (marks >= 0 && marks <= 100) {
                return marks;
            } else {
                System.out.println("Invalid marks. Please enter a value between 0 and 100.");
            }
        }
    }

    // Method to calculate grade based on percentage
    private static String calculateGrade(double percentage) {
        if (percentage >= 80) {
            return "A (Level 4, above normalized standards)";
        } else if (percentage >= 70) {
            return "B (Level 3, at normalized standards)";
        } else if (percentage >= 60) {
            return "C (Level 2, below normalized standards)";
        } else if (percentage >= 50) {
            return "D (Level 1, well below normalized standards)";
        } else if (percentage >= 40) {
            return "E (Level 1-, too below normalized standards)";
        } else {
            return "R (Remedial Student)";
        }
    }
}
