import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = scanner.nextInt();
        
        // Create arrays to store weight, height, BMI, and weight status
        double[] weights = new double[numberOfPersons];
        double[] heights = new double[numberOfPersons];
        double[] bmiValues = new double[numberOfPersons];
        String[] weightStatus = new String[numberOfPersons];

        // Take input for weight and height of each person
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
            weights[i] = scanner.nextDouble();
            System.out.print("Enter height (in meters) for person " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
        }

        // Calculate BMI and determine weight status
        for (int i = 0; i < numberOfPersons; i++) {
            // Calculate BMI
            bmiValues[i] = weights[i] / (heights[i] * heights[i]);
            
            // Determine weight status
            if (bmiValues[i] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmiValues[i] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmiValues[i] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obesity";
            }
        }

        // Display the results
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Height", "Weight", "BMI", "Weight Status");
        System.out.println("-----------------------------------------------------");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s%n", heights[i], weights[i], bmiValues[i], weightStatus[i]);
        }

        scanner.close();
    }
}
