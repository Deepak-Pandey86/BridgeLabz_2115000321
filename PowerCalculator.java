import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get integer input for the base number
        System.out.print("Enter the base number: ");
        int number = scanner.nextInt();
        
        // Get integer input for the power
        System.out.print("Enter the power: ");
        int power = scanner.nextInt();
        
        // Variable to store the result, initialized to 1
        int result = 1;
        
        // Run a for loop from 1 to power
        for (int i = 1; i <= power; i++) {
            result *= number; // Multiply result by the number
        }
        
        // Print the result
        System.out.println(number + " raised to the power of " + power + " is: " + result);
        
        scanner.close();
    }
}
