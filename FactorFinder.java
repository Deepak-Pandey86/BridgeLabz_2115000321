import java.util.Scanner;

public class FactorFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get input value for the number
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        
        // Check if the number is positive
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Factors of " + number + " are:");
            // Run a for loop from 1 to number
            for (int i = 1; i < number; i++) {
                // Check if number is perfectly divisible by i
                if (number % i == 0) {
                    System.out.println(i); // Print the factor
                }
            }
            // Optionally, print the number itself as a factor
            System.out.println(number); // The number is also a factor of itself
        }
        
        scanner.close();
    }
}