import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;


public class DatabaseToCSV {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/company"; // Change to your DB details
        String dbUser = "root";
        String dbPassword = "password";
        String csvFile = "employees.csv";


        String query = "SELECT employee_id, name, department, salary FROM employees";


        try (Connection conn = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query);
             FileWriter writer = new FileWriter(csvFile)) {


            // Write CSV Header
            writer.append("Employee ID,Name,Department,Salary\n");


            // Write Data Rows
            while (rs.next()) {
                writer.append(rs.getInt("employee_id") + ",");
                writer.append(rs.getString("name") + ",");
                writer.append(rs.getString("department") + ",");
                writer.append(rs.getDouble("salary") + "\n");
            }


            System.out.println("CSV report generated successfully: " + csvFile);
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }
}
