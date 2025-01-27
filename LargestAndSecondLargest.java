import java.util.Scanner;

public class LargestAndSecondLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Define an array to store the digits
        int maxDigit = 10; // Maximum number of digits
        int[] digits = new int[maxDigit];
        int index = 0; // To track the index of the array

        // Extract digits and store them in the array
        while (number != 0) {
            digits[index] = number % 10; // Get the last digit
            number /= 10; // Remove the last digit
            index++; // Increment the index
            
            // Break if the maximum size is reached
            if (index == maxDigit) {
                break;
            }
        }

        // Variables to store the largest and second largest digits
        int largest = -1; // Initialize to -1 to handle cases where all digits are negative
        int secondLargest = -1;

        // Loop through the array to find the largest and second largest digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest; // Update second largest
                largest = digits[i]; // Update largest
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i]; // Update second largest
            }
        }

        // Display the results
        if (largest != -1) {
            System.out.println("Largest digit: " + largest);
        } else {
            System.out.println("No digits found.");
        }

        if (secondLargest != -1) {
            System.out.println("Second largest digit: " + secondLargest);
        } else {
            System.out.println("No second largest digit found.");
        }

        scanner.close();
    }
}
