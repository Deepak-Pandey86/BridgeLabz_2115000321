import java.util.Scanner;

public class ArmstrongNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get user input for the number
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        // Initialize variables
        int sum = 0; // To store the sum of cubes of digits
        int originalNumber = number; // Store the original number for comparison
        
        // Use a while loop to calculate the sum of cubes of each digit
        while (originalNumber != 0) {
            // Find the last digit (remainder)
            int digit = originalNumber % 10;
            
            // Calculate the cube of the digit and add it to the sum
            sum += digit * digit * digit; // or Math.pow(digit, 3)
            
            // Remove the last digit from the original number
            originalNumber /= 10; // This is equivalent to originalNumber = originalNumber / 10
        }
        
        // Check if the original number and the sum of cubes are the same
        if (number == sum) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
        
        scanner.close();
    }
}
