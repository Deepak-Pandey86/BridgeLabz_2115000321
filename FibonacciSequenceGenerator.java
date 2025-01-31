import java.util.Scanner;

public class FibonacciSequenceGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of terms from the user
        System.out.print("Enter the number of terms in the Fibonacci sequence: ");
        int terms = scanner.nextInt();

        // Generate and print the Fibonacci sequence
        printFibonacciSequence(terms);

        scanner.close();
    }

    // Method to calculate and print the Fibonacci sequence
    public static void printFibonacciSequence(int n) {
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        long first = 0, second = 1; // First two terms of the Fibonacci sequence

        System.out.print("Fibonacci Sequence: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " "); // Print the current term

            // Calculate the next term
            long next = first + second;
            first = second; // Update first to the second term
            second = next; // Update second to the next term
        }
        System.out.println(); // New line after printing the sequence
    }
}
