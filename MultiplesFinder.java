import java.util.Scanner;

public class MultiplesFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get input value for the number
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        
        // Check if the number is positive
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Multiples of " + number + " below 100 are:");
            // Run a for loop backward from 100 to 1
            for (int i = 100; i >= 1; i--) {
                // Check if i is a multiple of the number
                if (i % number == 0) {
                    System.out.println(i); // Print the multiple
                }
            }
        }
        
        scanner.close();
    }
}
