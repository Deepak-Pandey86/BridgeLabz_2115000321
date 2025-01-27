import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Initialize total to 0.0
        double total = 0.0;
        double userInput;

        // Prompt the user for input
        System.out.println("Enter numbers to sum them up. Enter 0 to finish.");

        // Use a while loop to check if the user entered 0
        while (true) {
            System.out.print("Enter a number: ");
            userInput = scanner.nextDouble(); // Read user input
            
            // Check if the user entered 0
            if (userInput == 0) {
                break; // Exit the loop if the input is 0
            }
            
            // Add the user-entered value to the total
            total += userInput;
        }
        
        // Display the total value
        System.out.println("The total sum is: " + total);
        
        scanner.close();
    }
}
