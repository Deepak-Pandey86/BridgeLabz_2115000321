import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI for each person and populate the BMI column
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInMeters = data[i][1] / 100; // Convert height from cm to meters
            double bmi = weight / (heightInMeters * heightInMeters);
            data[i][2] = bmi; // Store BMI in the third column
        }
    }

    // Method to determine BMI status
    public static String[] determineBMIStatus(double[][] data) {
        String[] status = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                status[i] = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obesity";
            }
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 2D array to store weight, height, and BMI for 10 persons
        double[][] data = new double[10][3];

        // Input for weight and height
        for (int i = 0; i < data.length; i++) {
            System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
            data[i][0] = scanner.nextDouble(); // Weight
            System.out.print("Enter height (in cm) for person " + (i + 1) + ": ");
            data[i][1] = scanner.nextDouble(); // Height
        }

        // Calculate BMI for each person
        calculateBMI(data);

        // Determine BMI status for each person
        String[] bmiStatus = determineBMIStatus(data);

        // Display the results
        System.out.println("\nBMI Results:");
        System.out.printf("%-10s %-10s %-10s %-20s%n", "Weight", "Height", "BMI", "Status");
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-20s%n", data[i][0], data[i][1], data[i][2], bmiStatus[i]);
        }

        scanner.close();
    }
}
