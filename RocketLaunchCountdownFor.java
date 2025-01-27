import java.util.Scanner;

public class RocketLaunchCountdownFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get user input for the countdown value
        System.out.print("Enter the countdown start value: ");
        int counter = scanner.nextInt();
        
        // Check if the input is a positive integer
        if (counter < 1) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else {
            // Countdown using a for loop
            for (int i = counter; i >= 1; i--) {
                System.out.println(i); // Print the current counter value
            }
            System.out.println("Liftoff!"); // Indicate the end of the countdown
        }
        
        scanner.close();
    }
}