import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input marks for Physics, Chemistry, and Maths
        System.out.print("Enter marks for Physics: ");
        int physicsMarks = scanner.nextInt();

        System.out.print("Enter marks for Chemistry: ");
        int chemistryMarks = scanner.nextInt();

        System.out.print("Enter marks for Maths: ");
        int mathsMarks = scanner.nextInt();

        // Calculate total marks
        int totalMarks = physicsMarks + chemistryMarks + mathsMarks;

        // Calculate percentage
        double percentage = (double) totalMarks / 300 * 100;

        // Determine the grade based on the percentage
        char grade = calculateGrade(percentage);

        // Display the results
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
    }

    // Method to calculate the grade based on the percentage
    private static char calculateGrade(double percentage) {
        if (percentage >= 80) {
            return 'A';
        } else if (percentage >= 70) {
            return 'B';
        } else if (percentage >= 60) {
            return 'C';
        } else if (percentage >= 50) {
            return 'D';
        } else if (percentage >= 40) {
            return 'E';
        } else {
            return 'R';
        }
    }
}
