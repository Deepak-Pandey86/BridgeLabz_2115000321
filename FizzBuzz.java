import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input number from user
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        
        // Check if the number is positive
        if (number < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Loop from 0 to the entered number
            for (int i = 0; i <= number; i++) {
                // Check for multiples of 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
        }
        
        scanner.close();
    }
}