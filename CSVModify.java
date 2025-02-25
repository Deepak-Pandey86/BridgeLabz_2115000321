import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class CSVModify {
    public static void main(String[] args) {
        String inputFile = "employees.csv";    // Original CSV file
        String outputFile = "updated_employees.csv"; // Updated CSV file
        List<String[]> data = new ArrayList<>();


        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String line;
            boolean isHeader = true;


            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");


                if (isHeader) { // Store header separately
                    isHeader = false;
                } else {
                    String department = fields[2].trim();  // Assuming Department is in the 3rd column
                    if (department.equalsIgnoreCase("IT")) {
                        double salary = Double.parseDouble(fields[3].trim());
                        salary *= 1.10; // Increase by 10%
                        fields[3] = String.format("%.2f", salary); // Format to 2 decimal places
                    }
                }
                data.add(fields);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }


        // Write updated data to a new CSV file
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {
            for (String[] row : data) {
                bw.write(String.join(",", row));
                bw.newLine();
            }
            System.out.println("Updated salaries saved to: " + outputFile);
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}
