import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


class Employee {
    public int employeeID;
    public String name;
    public String department;
    public double salary;


    public Employee(int employeeID, String name, String department, double salary) {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}


public class DatabaseToJson {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/company_db";
        String user = "root";
        String password = "password";


        List<Employee> employeeList = new ArrayList<>();


        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM employees")) {


            while (rs.next()) {
                employeeList.add(new Employee(
                        rs.getInt("EmployeeID"),
                        rs.getString("Name"),
                        rs.getString("Department"),
                        rs.getDouble("Salary")
                ));
            }


            // Convert List to JSON
            ObjectMapper objectMapper = new ObjectMapper();
            ObjectWriter writer = objectMapper.writerWithDefaultPrettyPrinter();
            String jsonOutput = writer.writeValueAsString(employeeList);


            // Print JSON report
            System.out.println("Generated JSON Report:\n" + jsonOutput);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
