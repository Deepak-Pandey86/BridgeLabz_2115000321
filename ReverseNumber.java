import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Count the number of digits
        int temp = number;
        int count = 0;
        while (temp != 0) {
            temp /= 10; // Remove the last digit
            count++; // Increment the digit count
        }

        // Create an array to store the digits
        int[] digits = new int[count];
        
        // Store the digits in the array
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10; // Get the last digit
            number /= 10; // Remove the last digit
        }

        // Display the digits in reverse order
        System.out.print("Reversed number: ");
        for (int digit : digits) {
            System.out.print(digit);
        }
        System.out.println(); // New line for better output formatting

        scanner.close();
    }
}