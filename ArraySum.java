import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        // Input numbers into the array until the user enters 0 or a negative number
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double number = scanner.nextDouble();

            if (number <= 0) {
                break; // Exit the loop if the number is 0 or negative
            }

            if (index >= numbers.length) {
                break; // Exit the loop if the array is full
            }

            numbers[index] = number;
            index++;
        }

        // Calculate the sum of the numbers in the array
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        // Display the numbers and the total sum
        System.out.println("Numbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\nSum of numbers: " + total);
    }
}
