import java.util.Scanner;

public class VotingEligibilityChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get input value for the age
        System.out.print("Enter the person's age: ");
        int age = scanner.nextInt();
        
        // Check if the person can vote
        if (age >= 18) {
            // Output if the person can vote
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            // Output if the person cannot vote
            System.out.println("The person's age is " + age + " and cannot vote.");
        }
        
        scanner.close();
    }
}
