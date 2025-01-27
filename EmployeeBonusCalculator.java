import java.util.Scanner;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Define arrays to store salary and years of service for 10 employees
        double[] salaries = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonuses = new double[10];
        double[] newSalaries = new double[10];
        
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        // Loop to take input for 10 employees
        for (int i = 0; i < 10; i++) {
            while (true) {
                System.out.print("Enter salary for employee " + (i + 1) + ": ");
                salaries[i] = scanner.nextDouble();
                
                System.out.print("Enter years of service for employee " + (i + 1) + ": ");
                yearsOfService[i] = scanner.nextDouble();
                
                // Validate input
                if (salaries[i] < 0 || yearsOfService[i] < 0) {
                    System.out.println("Invalid input. Salary and years of service must be non-negative. Please enter again.");
                } else {
                    break; // Valid input, exit the loop
                }
            }
        }

        // Loop to calculate bonuses and new salaries
        for (int i = 0; i < 10; i++) {
            // Calculate bonus based on years of service
            if (yearsOfService[i] > 5) {
                bonuses[i] = salaries[i] * 0.05; // 5% bonus
            } else {
                bonuses[i] = salaries[i] * 0.02; // 2% bonus
            }
            
            // Calculate new salary
            newSalaries[i] = salaries[i] + bonuses[i];
            
            // Update total amounts
            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        // Print total bonus payout and total salaries
        System.out.printf("Total Bonus Payout: %.2f%n", totalBonus);
        System.out.printf("Total Old Salary: %.2f%n", totalOldSalary);
        System.out.printf("Total New Salary: %.2f%n", totalNewSalary);
        
        scanner.close();
    }
}
