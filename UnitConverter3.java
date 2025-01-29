public class UnitConverter3 {

    // Constant conversion factors
    private static final double FAHRENHEIT_TO_CELSIUS = 5.0 / 9.0;
    private static final double CELSIUS_TO_FAHRENHEIT = 9.0 / 5.0;
    private static final double POUNDS_TO_KILOGRAMS = 0.453592;
    private static final double KILOGRAMS_TO_POUNDS = 2.20462;
    private static final double GALLONS_TO_LITERS = 3.78541;
    private static final double LITERS_TO_GALLONS = 0.264172;

    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * FAHRENHEIT_TO_CELSIUS;
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * CELSIUS_TO_FAHRENHEIT) + 32;
    }

    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        return pounds * POUNDS_TO_KILOGRAMS;
    }

    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * KILOGRAMS_TO_POUNDS;
    }

    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        return gallons * GALLONS_TO_LITERS;
    }

    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        return liters * LITERS_TO_GALLONS;
    }

    // Main method for testing the UnitConverter class
    public static void main(String[] args) {
        // Test the conversion methods
        double fahrenheit = 100.0;
        double celsius = convertFahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + " °F is equal to " + celsius + " °C.");

        celsius = 37.0;
        fahrenheit = convertCelsiusToFahrenheit(celsius);
        System.out.println(celsius + " °C is equal to " + fahrenheit + " °F.");

        double pounds = 150.0;
        double kilograms = convertPoundsToKilograms(pounds);
        System.out.println(pounds + " lbs is equal to " + kilograms + " kg.");

        kilograms = 68.0;
        pounds = convertKilogramsToPounds(kilograms);
        System.out.println(kilograms + " kg is equal to " + pounds + " lbs.");

        double gallons = 5.0;
        double liters = convertGallonsToLiters(gallons);
        System.out.println(gallons + " gallons is equal to " + liters + " liters.");

        liters = 20.0;
        gallons = convertLitersToGallons(liters);
        System.out.println(liters + " liters is equal to " + gallons + " gallons.");
    }
}
