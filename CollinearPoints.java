import java.util.Scanner;

public class CollinearPoints {

    // Method to check if three points are collinear using the slope formula
    public static boolean areCollinearUsingSlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Calculate slopes
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);

        // Check if all slopes are equal
        return (slopeAB == slopeBC) && (slopeAB == slopeAC);
    }

    // Method to check if three points are collinear using the area of the triangle formula
    public static boolean areCollinearUsingArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Calculate the area of the triangle
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0; // Points are collinear if area is 0
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the three points
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();
        System.out.print("Enter x3: ");
        double x3 = scanner.nextDouble();
        System.out.print("Enter y3: ");
        double y3 = scanner.nextDouble();

        // Check if the points are collinear using slope
        boolean collinearBySlope = areCollinearUsingSlope(x1, y1, x2, y2, x3, y3);
        // Check if the points are collinear using area
        boolean collinearByArea = areCollinearUsingArea(x1, y1, x2, y2, x3, y3);

        // Display results
        if (collinearBySlope && collinearByArea) {
            System.out.println("The points are collinear.");
        } else {
            System.out.println("The points are not collinear.");
        }

        // Sample check for points A(2, 4), B(4, 6), C(6, 8)
        double xA = 2, yA = 4, xB = 4, yB = 6, xC = 6, yC = 8;
        boolean sampleCollinearBySlope = areCollinearUsingSlope(xA, yA, xB, yB, xC, yC);
        boolean sampleCollinearByArea = areCollinearUsingArea(xA, yA, xB, yB, xC, yC);

        if (sampleCollinearBySlope && sampleCollinearByArea) {
            System.out.println("The sample points A(2, 4), B(4, 6), C(6, 8) are collinear.");
        } else {
            System.out.println("The sample points A(2, 4), B(4, 6), C(6, 8) are not collinear.");
        }

        scanner.close();
    }
}
