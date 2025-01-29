public class UnitConverter2 {

    // Constant conversion factors
    private static final double YARDS_TO_FEET = 3.0;
    private static final double FEET_TO_YARDS = 0.333333;
    private static final double METERS_TO_INCHES = 39.3701;
    private static final double INCHES_TO_METERS = 0.0254;
    private static final double INCHES_TO_CENTIMETERS = 2.54;

    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        return yards * YARDS_TO_FEET;
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        return feet * FEET_TO_YARDS;
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        return meters * METERS_TO_INCHES;
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        return inches * INCHES_TO_METERS;
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        return inches * INCHES_TO_CENTIMETERS;
    }

    // Main method for testing the UnitConverter class
    public static void main(String[] args) {
        // Test the conversion methods
        double yards = 10.0;
        double feet = convertYardsToFeet(yards);
        System.out.println(yards + " yards is equal to " + feet + " feet.");

        feet = 30.0;
        yards = convertFeetToYards(feet);
        System.out.println(feet + " feet is equal to " + yards + " yards.");

        double meters = 5.0;
        double inches = convertMetersToInches(meters);
        System.out.println(meters + " meters is equal to " + inches + " inches.");

        inches = 12.0;
        meters = convertInchesToMeters(inches);
        System.out.println(inches + " inches is equal to " + meters + " meters.");

        inches = 10.0;
        double centimeters = convertInchesToCentimeters(inches);
        System.out.println(inches + " inches is equal to " + centimeters + " centimeters.");
    }
}
