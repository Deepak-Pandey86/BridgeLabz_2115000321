import java.io.*;
import java.util.*;


class Employee {
    String id, name, department;
    double salary;


    public Employee(String id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}


public class CSVSortBySalary {
    public static void main(String[] args) {
        String inputFile = "employees.csv";
        List<Employee> employees = new ArrayList<>();


        // Read the CSV file and store employee data
        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String line;
            boolean isHeader = true;


            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");
                if (isHeader) {
                    isHeader = false;
                    continue; // Skip header row
                }


                String id = fields[0].trim();
                String name = fields[1].trim();
                String department = fields[2].trim();
                double salary = Double.parseDouble(fields[3].trim());


                employees.add(new Employee(id, name, department, salary));
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }


        // Sort employees by salary in descending order
        employees.sort((e1, e2) -> Double.compare(e2.salary, e1.salary));


        // Print top 5 highest-paid employees
        System.out.println("Top 5 Highest Paid Employees:");
        System.out.println("ID\tName\tDepartment\tSalary");


        for (int i = 0; i < Math.min(5, employees.size()); i++) {
            Employee e = employees.get(i);
            System.out.println(e.id + "\t" + e.name + "\t" + e.department + "\t" + e.salary);
        }
    }
}
