import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get user input for the number
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();
        
        // Check if the input is a natural number
        if (n < 1) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else {
            // Calculate the sum using the while loop
            int sumUsingWhile = 0;
            int i = 1;
            while (i <= n) {
                sumUsingWhile += i; // Add i to the sum
                i++; // Increment i
            }
            
            // Calculate the sum using the formula
            int sumUsingFormula = n * (n + 1) / 2;
            
            // Compare the two results
            System.out.println("Sum using while loop: " + sumUsingWhile);
            System.out.println("Sum using formula: " + sumUsingFormula);
            
            if (sumUsingWhile == sumUsingFormula) {
                System.out.println("Both computations are correct and equal.");
            } else {
                System.out.println("There is a discrepancy between the two computations.");
            }
        }
        
        scanner.close();
    }
}
