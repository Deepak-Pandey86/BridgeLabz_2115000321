import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take input for the number
        System.out.print("Enter a number: ");
        long number = scanner.nextLong(); // Use long to handle large numbers
        
        // Count the number of digits
        int count = 0;
        long temp = number;
        while (temp != 0) {
            temp /= 10; // Remove the last digit
            count++; // Increment the digit count
        }

        // Create an array to store the digits
        int[] digits = new int[count];
        
        // Store the digits in the array
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = (int) (number % 10); // Get the last digit
            number /= 10; // Remove the last digit
        }

        // Create a frequency array to count the frequency of each digit
        int[] frequency = new int[10]; // Array to store frequency of digits 0-9

        // Calculate the frequency of each digit
        for (int digit : digits) {
            frequency[digit]++; // Increment the frequency of the digit
        }

        // Display the frequency of each digit
        System.out.println("Digit Frequency:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) { // Only display digits that appear in the number
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }

        scanner.close();
    }
}
