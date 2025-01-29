import java.util.Scanner;

public class NumberChecker3 {

    // Method to find the count of digits in the number
    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    // Method to store the digits of the number in a digits array
    public static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Method to find the sum of the digits of a number
    public static int findSumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to find the sum of the squares of the digits of a number
    public static double findSumOfSquaresOfDigits(int[] digits) {
        double sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    // Method to check if a number is a Harshad number
    public static boolean isHarshadNumber(int number, int[] digits) {
        int sum = findSumOfDigits(digits);
        return number % sum == 0;
    }

    // Method to find the frequency of each digit in the number
    public static int[][] findFrequencyOfDigits(int[] digits) {
        int[][] frequency = new int[10][2]; // 10 digits (0-9)
        for (int digit : digits) {
            frequency[digit][0] = digit; // Store the digit
            frequency[digit][1]++; // Increment the frequency
        }
        return frequency;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Count digits
        int digitCount = countDigits(number);
        System.out.println("Count of digits: " + digitCount);

        // Store digits in an array
        int[] digits = storeDigits(number);
        System.out.print("Digits: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();

        // Find sum of digits
        int sumOfDigits = findSumOfDigits(digits);
        System.out.println("Sum of digits: " + sumOfDigits);

        // Find sum of squares of digits
        double sumOfSquaresOfDigits = findSumOfSquaresOfDigits(digits);
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits);

        // Check if the number is a Harshad number
        boolean isHarshad = isHarshadNumber(number, digits);
        System.out.println("Is Harshad Number: " + isHarshad);

        // Find frequency of each digit
        int[][] frequency = findFrequencyOfDigits(digits);
        System.out.println("Frequency of each digit:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i][1] > 0) {
                System.out.println("Digit: " + frequency[i][0] + ", Frequency: " + frequency[i][1]);
            }
        }

        scanner.close();
    }
}
