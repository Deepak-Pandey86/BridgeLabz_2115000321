import java.util.Scanner;

public class NaturalNumberSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take user input
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();
        
        // Check if the input is a natural number
        if (n < 1) {
            System.out.println("Please enter a natural number greater than 0.");
            return; // Exit the program
        }
        
        // Calculate sum using recursion
        int recursiveSum = sumOfNaturalNumbers(n);
        
        // Calculate sum using the formula
        int formulaSum = sumUsingFormula(n);
        
        // Display the results
        System.out.println("Sum of first " + n + " natural numbers (recursive): " + recursiveSum);
        System.out.println("Sum of first " + n + " natural numbers (formula): " + formulaSum);
        
        // Compare the results
        if (recursiveSum == formulaSum) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("There is a discrepancy between the two methods.");
        }
        
        scanner.close();
    }

    // Method to find the sum of n natural numbers using recursion
    public static int sumOfNaturalNumbers(int n) {
        if (n == 1) {
            return 1; // Base case
        } else {
            return n + sumOfNaturalNumbers(n - 1); // Recursive case
        }
    }

    // Method to find the sum of n natural numbers using the formula
    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2; // Formula for the sum of first n natural numbers
    }
}
