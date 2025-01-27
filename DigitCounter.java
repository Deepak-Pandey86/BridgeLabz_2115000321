import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get user input for the number
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        // Handle negative numbers by taking the absolute value
        number = Math.abs(number);
        
        // Initialize count variable
        int count = 0;

        // Use a loop to count the number of digits
        if (number == 0) {
            count = 1; // Special case for 0
        } else {
            while (number != 0) {
                number /= 10; // Remove the last digit
                count++; // Increase count by 1
            }
        }
        
        // Display the count of digits
        System.out.println("The number of digits is: " + count);
        
        scanner.close();
    }
}
