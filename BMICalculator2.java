import java.util.Scanner;

public class BMICalculator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = scanner.nextInt();
        
        // Create a multi-dimensional array to store weight, height, and BMI
        double[][] personData = new double[numberOfPersons][3]; // [][0] = height, [][1] = weight, [][2] = BMI
        String[] weightStatus = new String[numberOfPersons];

        // Take input for weight and height of each person
        for (int i = 0; i < numberOfPersons; i++) {
            // Input for weight
            double weight;
            do {
                System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
                weight = scanner.nextDouble();
                if (weight < 0) {
                    System.out.println("Please enter a positive value for weight.");
                }
            } while (weight < 0);
            personData[i][1] = weight; // Store weight in the array

            // Input for height
            double height;
            do {
                System.out.print("Enter height (in meters) for person " + (i + 1) + ": ");
                height = scanner.nextDouble();
                if (height < 0) {
                    System.out.println("Please enter a positive value for height.");
                }
            } while (height < 0);
            personData[i][0] = height; // Store height in the array
        }

        // Calculate BMI and determine weight status
        for (int i = 0; i < numberOfPersons; i++) {
            double height = personData[i][0];
            double weight = personData[i][1];
            personData[i][2] = weight / (height * height); // Calculate BMI

            // Determine weight status
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obesity";
            }
        }

        // Display the results
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Height", "Weight", "BMI", "Weight Status");
        System.out.println("-----------------------------------------------------");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s%n", personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }

        scanner.close();
    }
}
