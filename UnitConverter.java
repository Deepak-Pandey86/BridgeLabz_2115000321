public class UnitConverter {

    // Constant conversion factors
    private static final double KM_TO_MILES = 0.621371;
    private static final double MILES_TO_KM = 1.60934;
    private static final double METERS_TO_FEET = 3.28084;
    private static final double FEET_TO_METERS = 0.3048;

    // Method to convert kilometers to miles
    public static double convertKmToMiles(double km) {
        return km * KM_TO_MILES;
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        return miles * MILES_TO_KM;
    }

    // Method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        return meters * METERS_TO_FEET;
    }

    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        return feet * FEET_TO_METERS;
    }

    // Main method for testing the UnitConverter class
    public static void main(String[] args) {
        // Test the conversion methods
        double km = 10.0;
        double miles = convertKmToMiles(km);
        System.out.println(km + " kilometers is equal to " + miles + " miles.");

        miles = 6.2;
        km = convertMilesToKm(miles);
        System.out.println(miles + " miles is equal to " + km + " kilometers.");

        double meters = 5.0;
        double feet = convertMetersToFeet(meters);
        System.out.println(meters + " meters is equal to " + feet + " feet.");

        feet = 16.4;
        meters = convertFeetToMeters(feet);
        System.out.println(feet + " feet is equal to " + meters + " meters.");
    }
}
