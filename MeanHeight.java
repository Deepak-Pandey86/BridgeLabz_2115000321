import java.util.Scanner;

public class MeanHeight {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Create a double array named heights of size 11
        double[] heights = new double[11];

        // Get input values from the user
        System.out.println("Enter the heights of the 11 players:");
        for (int i = 0; i < heights.length; i++) {
            heights[i] = scanner.nextDouble();
        }

        // Find the sum of all the elements present in the array
        double sum = 0;
        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }

        // Divide the sum by 11 to find the mean height
        double meanHeight = sum / 11;

        // Print the mean height of the football team
        System.out.println("The mean height of the football team is: " + meanHeight);
    }
}
