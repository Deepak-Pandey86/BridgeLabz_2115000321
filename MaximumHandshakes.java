import java.util.Scanner;

public class MaximumHandshakes {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Check if the input is valid (non-negative number)
        if (numberOfStudents < 0) {
            System.out.println("Number of students cannot be negative.");
        } else {
            // Calculate the maximum number of handshakes using the formula
            int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

            // Display the result
            System.out.println("The maximum number of handshakes possible is: " + maxHandshakes);
        }

        // Close the scanner
        scanner.close();
    }
}
