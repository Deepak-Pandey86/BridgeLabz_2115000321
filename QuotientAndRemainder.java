import java.util.Scanner;

public class QuotientAndRemainder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get user input for the two numbers
        System.out.print("Enter the numerator (dividend): ");
        int number = scanner.nextInt();
        
        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();
        
        // Call the method to find the quotient and remainder
        int[] result = findRemainderAndQuotient(number, divisor);
        
        // Display the quotient and remainder
        System.out.println("Quotient: " + result[0]);
        System.out.println("Remainder: " + result[1]);
        
        scanner.close();
    }

    // Method to find the quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        // Calculate quotient and remainder
        int quotient = number / divisor;
        int remainder = number % divisor;
        
        // Return both quotient and remainder in an array
        return new int[]{quotient, remainder};
    }
}
