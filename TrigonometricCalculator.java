import java.util.Scanner;

public class TrigonometricCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get user input for the angle in degrees
        System.out.print("Enter the angle in degrees: ");
        double angle = scanner.nextDouble();
        
        // Call the method to calculate trigonometric functions
        double[] trigValues = calculateTrigonometricFunctions(angle);
        
        // Display the results
        System.out.println("Sine of " + angle + " degrees: " + trigValues[0]);
        System.out.println("Cosine of " + angle + " degrees: " + trigValues[1]);
        System.out.println("Tangent of " + angle + " degrees: " + trigValues[2]);
        
        scanner.close();
    }

    // Method to calculate the sine, cosine, and tangent of an angle (in degrees)
    public static double[] calculateTrigonometricFunctions(double angle) {
        // Convert the angle from degrees to radians
        double radians = Math.toRadians(angle);
        
        // Calculate sine, cosine, and tangent
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        
        // Return the values in an array
        return new double[]{sine, cosine, tangent};
    }
}
