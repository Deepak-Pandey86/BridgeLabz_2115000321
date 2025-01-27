import java.util.Scanner;

public class AbundantNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get user input for the number
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        // Initialize sum variable
        int sum = 0;

        // Run a for loop to find divisors and calculate their sum
        for (int i = 1; i < number; i++) {
            // Check if i is a divisor of number
            if (number % i == 0) {
                sum += i; // Add the divisor to sum
            }
        }
        
        // Check if the sum of divisors is greater than the number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is not an Abundant Number.");
        }
        
        scanner.close();
    }
}
