import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class CSVRowCounter {
    public static void main(String[] args) {
        String filePath = "employees.csv"; // Input CSV file
        int rowCount = 0;


        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean isHeader = true; // Flag to skip the header row


            while ((line = br.readLine()) != null) {
                if (isHeader) {
                    isHeader = false; // Skip the header
                    continue;
                }
                rowCount++; // Count each valid record
            }


            System.out.println("Total records (excluding header): " + rowCount);
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
