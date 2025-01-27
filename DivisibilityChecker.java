import java.util.Scanner;

public class DivisibilityChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get input value for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Check if the number is divisible by 5
        boolean isDivisible = (number % 5 == 0);
        
        // Output the result
        System.out.println("Is the number " + number + " divisible by 5? " + isDivisible);
        
        scanner.close();
    }
}
