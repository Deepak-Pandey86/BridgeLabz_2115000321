import java.util.Scanner;

public class SumOfNaturalNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get integer input from the user
        System.out.print("Enter a positive integer n: ");
        int n = scanner.nextInt();
        
        // Ensure n is a positive number
        if (n > 0) {
            // Call method to find the sum of first n natural numbers
            int sum = sumOfNaturalNumbers(n);
            System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        } else {
            System.out.println("Please enter a positive integer.");
        }
        
        scanner.close();
    }

    // Method to find the sum of the first n natural numbers using loop
    public static int sumOfNaturalNumbers(int n) {
        int sum = 0;
        
        // Loop to add natural numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        
        return sum;
    }
}
