import java.util.Scanner;

public class FactorialCalculatorFor {
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

            // Compute the factorial using a for loop
            for (int i = 1; i <= number; i++) {
                factorial *= i; // Multiply factorial by i
            }
            
            // Print the factorial
            System.out.println("The factorial of " + number + " is: " + factorial);
        }
        
        scanner.close();
    }
}
