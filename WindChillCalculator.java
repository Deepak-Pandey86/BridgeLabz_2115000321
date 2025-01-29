import java.util.Scanner;

public class WindChillCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get user input for temperature and wind speed
        System.out.print("Enter the temperature (in Fahrenheit): ");
        double temperature = scanner.nextDouble();
        
        System.out.print("Enter the wind speed (in miles per hour): ");
        double windSpeed = scanner.nextDouble();
        
        // Call the method to calculate the wind chill temperature
        double windChill = calculateWindChill(temperature, windSpeed);
        
        // Display the wind chill temperature
        System.out.println("The wind chill temperature is: " + windChill + " °F");
        
        scanner.close();
    }

    // Method to calculate the wind chill temperature using the given formula
    public static double calculateWindChill(double temperature, double windSpeed) {
        // Wind chill formula
        double windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
        return windChill;
    }
}
