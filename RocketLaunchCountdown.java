import java.util.Scanner;

public class RocketLaunchCountdown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get user input for the countdown value
        System.out.print("Enter the countdown start value: ");
        int counter = scanner.nextInt();
        
        // Check if the input is a positive integer
        if (counter < 1) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else {
            // Countdown using a while loop
            while (counter >= 1) {
                System.out.println(counter); // Print the current counter value
                counter--; // Decrement the counter
            }
            System.out.println("Liftoff!"); // Indicate the end of the countdown
        }
        
        scanner.close();
    }
}