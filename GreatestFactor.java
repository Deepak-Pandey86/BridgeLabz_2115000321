import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get integer input from the user
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        
        // Variable to store the greatest factor
        int greatestFactor = 1; // Initialize to 1
        
        // Loop from number - 1 to 1
        for (int i = number - 1; i >= 1; i--) {
            // Check if i is a factor of number
            if (number % i == 0) {
                greatestFactor = i; // Assign i to greatestFactor
                break; // Exit the loop as we found the greatest factor
            }
        }
        
        // Display the greatest factor
        System.out.println("The greatest factor of " + number + " (besides itself) is: " + greatestFactor);
        
        scanner.close();
    }
}
