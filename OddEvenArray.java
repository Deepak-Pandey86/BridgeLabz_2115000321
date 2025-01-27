import java.util.Scanner;

public class OddEvenArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Check if the number is a natural number
        if (number <= 0) {
            System.out.println("Error: Please enter a positive integer.");
            return;
        }

        // Create arrays for odd and even numbers
        int[] evenNumbers = new int[number / 2 + 1];
        int[] oddNumbers = new int[number / 2 + 1];

        // Initialize index variables for odd and even numbers
        int evenIndex = 0;
        int oddIndex = 0;

        // Iterate from 1 to the number
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                // Even number
                evenNumbers[evenIndex] = i;
                evenIndex++;
            } else {
                // Odd number
                oddNumbers[oddIndex] = i;
                oddIndex++;
            }
        }

        // Print the odd and even numbers arrays
        System.out.println("Even numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }

        System.out.println("\nOdd numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
    }
}
