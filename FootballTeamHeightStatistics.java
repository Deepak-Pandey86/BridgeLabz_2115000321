
import java.util.Arrays;
import java.util.Random;

public class FootballTeamHeightStatistics {

    // Method to generate random heights for players
    public static int[] generateRandomHeights(int size) {
        Random random = new Random();
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            // Generate a random height between 150 and 250 cm
            heights[i] = 150 + random.nextInt(101); // 101 because we want to include 250
        }
        return heights;
    }

    // Method to find the sum of all elements in the array
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    // Method to find the mean height
    public static double findMeanHeight(int[] heights) {
        int sum = findSum(heights);
        return (double) sum / heights.length;
    }

    // Method to find the shortest height
    public static int findShortestHeight(int[] heights) {
        int minHeight = Integer.MAX_VALUE;
        for (int height : heights) {
            if (height < minHeight) {
                minHeight = height;
            }
        }
        return minHeight;
    }

    // Method to find the tallest height
    public static int findTallestHeight(int[] heights) {
        int maxHeight = Integer.MIN_VALUE;
        for (int height : heights) {
            if (height > maxHeight) {
                maxHeight = height;
            }
        }
        return maxHeight;
    }

    public static void main(String[] args) {
        int size = 11; // Number of players
        int[] heights = generateRandomHeights(size);

        // Display the generated heights
        System.out.println("Heights of players: " + Arrays.toString(heights));

        // Calculate statistics
        int shortest = findShortestHeight(heights);
        int tallest = findTallestHeight(heights);
        double meanHeight = findMeanHeight(heights);

        // Display the results
        System.out.println("Shortest height: " + shortest + " cm");
        System.out.println("Tallest height: " + tallest + " cm");
        System.out.printf("Mean height: %.2f cm%n", meanHeight);
    }
}
