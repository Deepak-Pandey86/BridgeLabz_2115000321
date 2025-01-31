import java.util.Scanner;

public class BasicMathOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display menu for mathematical operations
        System.out.println("Basic Math Operations");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Choose an operation (1-4): ");
        int choice = scanner.nextInt();

        // Input two numbers from the user
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Perform the chosen operation
        switch (choice) {
            case 1:
                double sum = add(num1, num2);
                System.out.printf("Result: %.2f + %.2f = %.2f%n", num1, num2, sum);
                break;
            case 2:
                double difference = subtract(num1, num2);
                System.out.printf("Result: %.2f - %.2f = %.2f%n", num1, num2, difference);
                break;
            case 3:
                double product = multiply(num1, num2);
                System.out.printf("Result: %.2f * %.2f = %.2f%n", num1, num2, product);
                break;
            case 4:
                if (num2 != 0) {
                    double quotient = divide(num1, num2);
                    System.out.printf("Result: %.2f / %.2f = %.2f%n", num1, num2, quotient);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid choice. Please select a number between 1 and 4.");
        }

        scanner.close();
    }

    // Method for addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Method for subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Method for multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Method for division
    public static double divide(double a, double b) {
        return a / b;
    }
}
