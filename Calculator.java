import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create two double variables and a String variable for the operator
        double first, second;
        String op;

        // Get input values for the variables
        System.out.print("Enter the first number: ");
        first = scanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        second = scanner.nextDouble();
        
        System.out.print("Enter an operator (+, -, *, /): ");
        op = scanner.next();

        // Perform the operation based on the input operator
        double result = 0;
        boolean validOperator = true; // Flag to check if the operator is valid

        // Using a for loop to demonstrate the structure (though not necessary for this task)
        for (int i = 1; i < 2; i++) { // Loop runs only once
            switch (op) {
                case "+":
                    result = first + second;
                    break;
                case "-":
                    result = first - second;
                    break;
                case "*":
                    result = first * second;
                    break;
                case "/":
                    if (second != 0) {
                        result = first / second;
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                        validOperator = false;
                    }
                    break;
                default:
                    System.out.println("Invalid Operator.");
                    validOperator = false;
                    break;
            }
        }

        // Print the result if the operator was valid
        if (validOperator) {
            System.out.println("The result is: " + result);
        }

        scanner.close();
    }
}
