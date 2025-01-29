import java.util.Scanner;

public class EuclideanDistanceAndLineEquation {

    // Method to find the Euclidean distance between two points
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to find the equation of a line given two points
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double[] lineEquation = new double[2]; // Array to hold slope (m) and y-intercept (b)

        // Calculate the slope (m)
        double m = (y2 - y1) / (x2 - x1);
        lineEquation[0] = m; // Store slope in the first index

        // Calculate the y-intercept (b)
        double b = y1 - m * x1;
        lineEquation[1] = b; // Store y-intercept in the second index

        return lineEquation;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the first point (x1, y1)
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();

        // Input for the second point (x2, y2)
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();

        // Calculate the Euclidean distance
        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean Distance: %.2f%n", distance);

        // Find the equation of the line
        double[] lineEquation = findLineEquation(x1, y1, x2, y2);
        double slope = lineEquation[0];
        double yIntercept = lineEquation[1];

        // Display the equation of the line
        System.out.printf("Equation of the line: y = %.2fx + %.2f%n", slope, yIntercept);

        scanner.close();
    }
}
