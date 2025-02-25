import java.io.*;
import java.util.*;


public class DuplicateCSVDetector {
    public static void main(String[] args) {
        String filePath = "students.csv"; // Change to your CSV file path
        Set<String> uniqueIds = new HashSet<>();
        List<String> duplicateRecords = new ArrayList<>();


        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean isHeader = true;


            while ((line = br.readLine()) != null) {
                if (isHeader) { 
                    isHeader = false; // Skip header
                    continue;
                }


                String[] values = line.split(","); // Assuming CSV is comma-separated
                String id = values[0].trim(); // First column is ID


                if (!uniqueIds.add(id)) {
                    duplicateRecords.add(line); // Add duplicate record to list
                }
            }


            // Print duplicate records
            if (duplicateRecords.isEmpty()) {
                System.out.println("No duplicate records found.");
            } else {
                System.out.println("Duplicate records found:");
                for (String record : duplicateRecords) {
                    System.out.println(record);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
