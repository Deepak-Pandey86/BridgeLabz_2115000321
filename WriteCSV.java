import java.io.FileWriter;
import java.io.IOException;


public class WriteCSV {
    public static void main(String[] args) {
        String filePath = "employees.csv"; // Output file


        try (FileWriter writer = new FileWriter(filePath)) {
            // Writing the header
            writer.append("ID,Name,Department,Salary\n");


            // Writing employee records
            writer.append("201,John Doe,IT,70000\n");
            writer.append("202,Alice Smith,HR,65000\n");
            writer.append("203,Bob Johnson,Finance,72000\n");
            writer.append("204,Emily Davis,Marketing,68000\n");
            writer.append("205,Michael Brown,Sales,75000\n");


            System.out.println("CSV file created successfully: " + filePath);
        } catch (IOException e) {
            System.out.println("Error writing to the file: " + e.getMessage());
        }
    }
}
