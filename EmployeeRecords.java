// Base class: Employee
class Employee {
    public int employeeID;         // Public: Accessible anywhere
    protected String department;   // Protected: Accessible in subclasses
    private double salary;         // Private: Encapsulated, accessed via getter/setter

    // Constructor
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Setter for salary (with validation)
    public void setSalary(double amount) {
        if (amount > 0) {
            this.salary = amount;
            System.out.println("Salary updated to: $" + amount);
        } else {
            System.out.println("Invalid salary amount! Salary cannot be negative.");
        }
    }

    // Display Employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }
}

// Subclass: Manager (demonstrating protected & public access)
class Manager extends Employee {
    private String team;

    // Constructor
    public Manager(int employeeID, String department, double salary, String team) {
        super(employeeID, department, salary);
        this.team = team;
    }

    // Method to display Manager details
    public void displayManagerDetails() {
        System.out.println("Manager Details:");
        System.out.println("Employee ID: " + employeeID); // Public: Accessible
        System.out.println("Department: " + department);  // Protected: Accessible in subclass
        System.out.println("Salary: $" + getSalary());    // Accessing private via getter
        System.out.println("Manages Team: " + team);
    }
}

// Main class
public class EmployeeRecords {
    public static void main(String[] args) {
        // Creating an Employee object
        Employee emp1 = new Employee(101, "Engineering", 60000.0);
        emp1.displayEmployeeDetails();

        // Modifying salary
        emp1.setSalary(65000.0);
        System.out.println("Updated Salary: $" + emp1.getSalary());

        System.out.println("\n------------------\n");

        // Creating a Manager object
        Manager mgr1 = new Manager(102, "IT", 80000.0, "Software Development");
        mgr1.displayManagerDetails();
    }
}
