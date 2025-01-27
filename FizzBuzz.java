import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        String[] results = new String[number + 1]; // Array to store results

        // Loop to generate FizzBuzz results
        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                results[i] = "Fizz";
            } else if (i % 5 == 0) {
                results[i] = "Buzz";
            } else {
                results[i] = String.valueOf(i); // Convert integer to String
            }
        }

        // Loop to display the results with index positions
        for (int i = 0; i <= number; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }
    }
}
