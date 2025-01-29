import java.util.Scanner;

public class YoungestAndTallestFinder {

    // Method to find the youngest friend
    public static String findYoungest(String[] names, int[] ages) {
        int minAgeIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[minAgeIndex]) {
                minAgeIndex = i;
            }
        }
        return names[minAgeIndex];
    }

    // Method to find the tallest friend
    public static String findTallest(String[] names, double[] heights) {
        int maxHeightIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[maxHeightIndex]) {
                maxHeightIndex = i;
            }
        }
        return names[maxHeightIndex];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Names of the friends
        String[] names = {"Amar", "Akbar", "Anthony"};
        
        // Arrays to store ages and heights
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Input for ages
        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter the age of " + names[i] + ": ");
            ages[i] = scanner.nextInt();
        }

        // Input for heights
        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter the height (in cm) of " + names[i] + ": ");
            heights[i] = scanner.nextDouble();
        }

        // Find and display the youngest friend
        String youngest = findYoungest(names, ages);
        System.out.println("The youngest friend is: " + youngest);

        // Find and display the tallest friend
        String tallest = findTallest(names, heights);
        System.out.println("The tallest friend is: " + tallest);

        scanner.close();
    }
}
