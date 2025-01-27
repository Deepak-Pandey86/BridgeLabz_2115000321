import java.util.Scanner;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get user input for salary and years of service
        System.out.print("Enter the employee's salary: ");
        double salary = scanner.nextDouble();
        
        System.out.print("Enter the years of service: ");
        int yearsOfService = scanner.nextInt();
        
        // Initialize bonus variable
        double bonus = 0.0;

        // Calculate bonus based on years of service
        if (yearsOfService > 5) {
            bonus = salary * 0.05; // 5% bonus
        }
        
        // Print the bonus amount
        System.out.println("The bonus amount is: " + bonus);
        
        scanner.close();
    }
}
