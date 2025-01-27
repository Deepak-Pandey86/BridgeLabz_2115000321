import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input number from user
        System.out.print("Enter a number greater than 1: ");
        int number = scanner.nextInt();
        
        // Check if the number is greater than 1
        if (number <= 1) {
            System.out.println("Please enter a number greater than 1.");
        } else {
            boolean isPrime = true; // Assume the number is prime
            
            // Loop through all numbers from 2 to the square root of the number
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false; // Number is divisible by i, so it's not prime
                    break; // Exit the loop
                }
            }
            
            // Output the result
            if (isPrime) {
                System.out.println(number + " is a Prime Number.");
            } else {
                System.out.println(number + " is not a Prime Number.");
            }
        }
        
        scanner.close();
    }
}