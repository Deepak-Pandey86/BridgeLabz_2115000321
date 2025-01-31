import java.util.Scanner;

public class GCDAndLCMCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers from the user
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Calculate GCD
        int gcd = calculateGCD(num1, num2);
        // Calculate LCM
        int lcm = calculateLCM(num1, num2, gcd);

        // Display the results
        displayResults(num1, num2, gcd, lcm);

        scanner.close();
    }

    // Method to calculate GCD using the Euclidean algorithm
    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a; // GCD is found
    }

    // Method to calculate LCM using the relationship between GCD and LCM
    public static int calculateLCM(int a, int b, int gcd) {
        return (a * b) / gcd; // LCM formula
    }

    // Method to display the results
    public static void displayResults(int num1, int num2, int gcd, int lcm) {
        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);
        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }
}
