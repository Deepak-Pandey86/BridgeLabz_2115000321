import java.util.Scanner;

public class HarshadNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get user input for the number
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        // Initialize sum variable
        int sum = 0;
        int originalNumber = number; // Store the original number for later use

        // Use a while loop to calculate the sum of the digits
        while (number != 0) {
            int digit = number % 10; // Get the last digit
            sum += digit; // Add the digit to sum
            number /= 10; // Remove the last digit
        }
        
        // Check if the original number is divisible by the sum of its digits
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
            System.out.println(originalNumber + " is not a Harshad Number.");
        }
        
        scanner.close();
    }
}
