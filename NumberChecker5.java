import java.util.Scanner;

public class NumberChecker5 {

    // Method to check if a number is a prime number
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to check if a number is a neon number
    public static boolean isNeon(int number) {
        int square = number * number;
        int sumOfDigits = 0;
        while (square > 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }
        return sumOfDigits == number;
    }

    // Method to check if a number is a spy number
    public static boolean isSpy(int number) {
        int sum = 0;
        int product = 1;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }
        return sum == product;
    }

    // Method to check if a number is an automorphic number
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        String squareStr = String.valueOf(square);
        String numberStr = String.valueOf(number);
        return squareStr.endsWith(numberStr);
    }

    // Method to check if a number is a buzz number
    public static boolean isBuzz(int number) {
        return number % 7 == 0 || String.valueOf(number).endsWith("7");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is prime
        boolean prime = isPrime(number);
        System.out.println("Is Prime: " + prime);

        // Check if the number is a neon number
        boolean neon = isNeon(number);
        System.out.println("Is Neon Number: " + neon);

        // Check if the number is a spy number
        boolean spy = isSpy(number);
        System.out.println("Is Spy Number: " + spy);

        // Check if the number is an automorphic number
        boolean automorphic = isAutomorphic(number);
        System.out.println("Is Automorphic Number: " + automorphic);

        // Check if the number is a buzz number
        boolean buzz = isBuzz(number);
        System.out.println("Is Buzz Number: " + buzz);

        scanner.close();
    }
}
