
import java.util.Scanner;

public class NumberChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Define an integer array of 5 elements
        int[] numbers = new int[5];

        // Get user input to store in the array
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Loop through the array using the length
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                // If the number is positive, check for even or odd numbers and print accordingly
                if (numbers[i] % 2 == 0) {
                    System.out.println(numbers[i] + " is positive and even.");
                } else {
                    System.out.println(numbers[i] + " is positive and odd.");
                }
            } else if (numbers[i] < 0) {
                // If the number is negative, print negative.
                System.out.println(numbers[i] + " is negative.");
            } else {
                // Else if the number is zero, print zero.
                System.out.println(numbers[i] + " is zero.");
            }
        }

        // Finally compare the first and last element of the array and display if they equal, greater or less
        if (numbers[0] == numbers[numbers.length - 1]) {
            System.out.println("The first and last elements are equal.");
        } else if (numbers[0] > numbers[numbers.length - 1]) {
            System.out.println("The first element is greater than the last element.");
        } else {
            System.out.println("The first element is less than the last element.");
        }

        scanner.close();
    }
}

