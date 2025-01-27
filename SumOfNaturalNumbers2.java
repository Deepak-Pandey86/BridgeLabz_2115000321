import java.util.Scanner;

public class SumOfNaturalNumbers2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get user input for the number
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();
        
        // Check if the input is a natural number
        if (n < 1) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else {
            // Calculate the sum using the for loop
            int sumUsingFor = 0;
            for (int i = 1; i <= n; i++) {
                sumUsingFor += i; // Add i to the sum
            }
            
            // Calculate the sum using the formula
            int sumUsingFormula = n * (n + 1) / 2;
            
            // Compare the two results
            System.out.println("Sum using for loop: " + sumUsingFor);
            System.out.println("Sum using formula: " + sumUsingFormula);
            
            if (sumUsingFor == sumUsingFormula) {
                System.out.println("Both computations are correct and equal.");
            } else {
                System.out.println("There is a discrepancy between the two computations.");
            }
        }
        
        scanner.close();
    }
}
