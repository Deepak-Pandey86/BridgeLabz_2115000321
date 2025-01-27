import java.util.Scanner;

public class YoungestAndTallestFriends {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Define arrays to store ages and heights of the 3 friends
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Input ages and heights for the 3 friends
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + friends[i] + ": ");
            ages[i] = scanner.nextInt();
            System.out.print("Enter height of " + friends[i] + " (in cm): ");
            heights[i] = scanner.nextDouble();
        }

        // Initialize variables to find the youngest and tallest
        int youngestIndex = 0; // Index of the youngest friend
        double tallestIndex = 0; // Index of the tallest friend

        // Loop through the arrays to find the youngest and tallest
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i; // Update index of the youngest friend
            }
            if (heights[i] > heights[(int) tallestIndex]) {
                tallestIndex = i; // Update index of the tallest friend
            }
        }

        // Display the youngest and tallest friends
        System.out.println("The youngest friend is: " + friends[youngestIndex] + " with age " + ages[youngestIndex]);
        System.out.println("The tallest friend is: " + friends[(int) tallestIndex] + " with height " + heights[(int) tallestIndex] + " cm");

        scanner.close();
    }
}
