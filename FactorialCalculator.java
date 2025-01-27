import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get user input for the integer
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        
        // Check if the input is a positive integer
        if (number < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Initialize factorial to 1
            long factorial = 1;
            int i = 1;

            // Compute the factorial using a while loop
            while (i <= number) {
                factorial *= i; // Multiply factorial by i
                i++; // Increment i
            }
            
            // Print the factorial
            System.out.println("The factorial of " + number + " is: " + factorial);
        }
        
        scanner.close();
    }
}
