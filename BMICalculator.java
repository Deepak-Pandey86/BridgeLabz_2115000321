import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input weight in kg
        System.out.print("Enter your weight in kg: ");
        double weight = scanner.nextDouble();
        
        // Input height in cm
        System.out.print("Enter your height in cm: ");
        double heightCm = scanner.nextDouble();
        
        // Convert height from cm to meters
        double heightM = heightCm / 100;
        
        // Calculate BMI
        double bmi = weight / (heightM * heightM);
        
        // Output the BMI
        System.out.printf("Your BMI is: %.2f%n", bmi);
        
        // Determine weight status based on BMI
        if (bmi <= 18.4) {
            System.out.println("Weight Status: Underweight");
        } else if (bmi >= 18.5 && bmi =< 24.9) {
            System.out.println("Weight Status: Normal weight");
        } else if (bmi >= 25 && bmi <= 39.9) {
            System.out.println("Weight Status: Overweight");
        } else {
            System.out.println("Weight Status: Obesity");
        }
        
        scanner.close();
    }
}