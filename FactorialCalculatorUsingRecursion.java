import java.util.Scanner;

public class FactorialCalculatorUsingRecursion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number from the user
        int number = getInput(scanner);

        // Calculate the factorial using a recursive function
        long factorial = calculateFactorial(number);

        // Display the result
        displayResult(number, factorial);

        scanner.close();
    }

    // Method to get input from the user
    public static int getInput(Scanner scanner) {
        System.out.print("Enter a non-negative integer: ");
        return scanner.nextInt();
    }

    // Recursive method to calculate the factorial of a number
    public static long calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        if (n == 0 || n == 1) {
            return 1; // Base case: 0! = 1 and 1! = 1
        }
        return n * calculateFactorial(n - 1); // Recursive case
    }

    // Method to display the result
    public static void displayResult(int number, long factorial) {
        System.out.println("The factorial of " + number + " is: " + factorial);
    }
}
