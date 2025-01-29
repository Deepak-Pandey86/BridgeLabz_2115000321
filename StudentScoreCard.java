import java.util.Random;
import java.util.Scanner;

public class StudentScoreCard {

    // Method to generate random 2-digit scores for Physics, Chemistry, and Math
    public static int[][] generateScores(int numberOfStudents) {
        Random random = new Random();
        int[][] scores = new int[numberOfStudents][3]; // 2D array to store scores for PCM

        for (int i = 0; i < numberOfStudents; i++) {
            scores[i][0] = random.nextInt(90) + 10; // Physics score (10 to 99)
            scores[i][1] = random.nextInt(90) + 10; // Chemistry score (10 to 99)
            scores[i][2] = random.nextInt(90) + 10; // Math score (10 to 99)
        }
        return scores;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][4]; // 2D array to store total, average, and percentage

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100; // Total marks are 300

            results[i][0] = total; // Total
            results[i][1] = Math.round(average * 100.0) / 100.0; // Average rounded to 2 decimal places
            results[i][2] = Math.round(percentage * 100.0) / 100.0; // Percentage rounded to 2 decimal places
        }
        return results;
    }

    // Method to display the scorecard of all students
    public static void displayScoreCard(int[][] scores, double[][] results) {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s%n", "Physics", "Chemistry", "Math", "Total", "Average", "Percentage");
        System.out.println("----------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d %-10d %-10d %-10.0f %-10.2f %-10.2f%n",
                    scores[i][0], scores[i][1], scores[i][2],
                    results[i][0], results[i][1], results[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Generate random scores for the students
        int[][] scores = generateScores(numberOfStudents);

        // Calculate total, average, and percentage for each student
        double[][] results = calculateResults(scores);

        // Display the scorecard
        displayScoreCard(scores, results);

        scanner.close();
    }
}
