import java.util.Scanner;

public class LargestAndSecondLargest2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Define initial size for the digits array
        int maxDigit = 10; // Initial maximum number of digits
        int[] digits = new int[maxDigit];
        int index = 0; // To track the index of the array

        // Extract digits and store them in the array
        while (number != 0) {
            // Check if we need to increase the size of the array
            if (index == maxDigit) {
                // Increase the size by 10
                maxDigit += 10;
                // Create a new array with the increased size
                int[] temp = new int[maxDigit];
                // Copy existing digits to the new array
                System.arraycopy(digits, 0, temp, 0, digits.length);
                // Assign the new array to digits
                digits = temp;
            }
            
            digits[index] = number % 10; // Get the last digit
            number /= 10; // Remove the last digit
            index++; // Increment the index
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