import java.util.Random;

public class EmployeeBonusCalculator {

    // Method to determine the salary and years of service
    public static double[][] generateEmployeeData(int numberOfEmployees) {
        Random random = new Random();
        double[][] employeeData = new double[numberOfEmployees][2]; // 2D array to store salary and years of service

        for (int i = 0; i < numberOfEmployees; i++) {
            // Generate a random 5-digit salary (10000 to 99999)
            double salary = 10000 + (random.nextInt(90000));
            // Generate random years of service (0 to 20)
            double yearsOfService = random.nextInt(21);
            employeeData[i][0] = salary; // Salary
            employeeData[i][1] = yearsOfService; // Years of service
        }
        return employeeData;
    }

    // Method to calculate the new salary and bonus
    public static double[][] calculateNewSalariesAndBonuses(double[][] employeeData) {
        double[][] updatedData = new double[employeeData.length][3]; // New array to store new salary and bonus

        for (int i = 0; i < employeeData.length; i++) {
            double oldSalary = employeeData[i][0];
            double yearsOfService = employeeData[i][1];
            double bonus;
            double newSalary;

            // Calculate bonus and new salary based on years of service
            if (yearsOfService > 5) {
                bonus = oldSalary * 0.05; // 5% bonus
            } else {
                bonus = oldSalary * 0.02; // 2% bonus
            }
            newSalary = oldSalary + bonus;

            // Store old salary, new salary, and bonus in the updated data array
            updatedData[i][0] = oldSalary; // Old salary
            updatedData[i][1] = newSalary; // New salary
            updatedData[i][2] = bonus; // Bonus
        }
        return updatedData;
    }

    // Method to calculate the sum of old salary, new salary, and total bonus
    public static void calculateAndDisplayTotals(double[][] updatedData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.printf("%-15s %-15s %-15s %-15s%n", "Old Salary", "New Salary", "Bonus", "Years of Service");
        for (int i = 0; i < updatedData.length; i++) {
            double oldSalary = updatedData[i][0];
            double newSalary = updatedData[i][1];
            double bonus = updatedData[i][2];
            double yearsOfService = (i < updatedData.length) ? (updatedData[i][0] * 0.02) / (oldSalary * 0.02) : 0; // Dummy value for years of service

            System.out.printf("%-15.2f %-15.2f %-15.2f %-15.2f%n", oldSalary, newSalary, bonus, yearsOfService);

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;
        }

        System.out.printf("%-15s %-15.2f %-15.2f %-15.2f%n", "Total", totalOldSalary, totalNewSalary, totalBonus);
    }

    public static void main(String[] args) {
        int numberOfEmployees = 10;

        // Generate employee data
        double[][] employeeData = generateEmployeeData(numberOfEmployees);

        // Calculate new salaries and bonuses
        double[][] updatedData = calculateNewSalariesAndBonuses(employeeData);

        // Calculate and display totals
        calculateAndDisplayTotals(updatedData);
    }
}
