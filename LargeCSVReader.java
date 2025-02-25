import java.io.*;


public class LargeCSVReader {
    public static void main(String[] args) {
        String filePath = "large_data.csv"; // Change this to your CSV file path
        int batchSize = 100; // Process 100 lines at a time
        int totalRecords = 0;


        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            int batchCount = 0;
            boolean isHeader = true; // Flag to skip header


            while ((line = br.readLine()) != null) {
                if (isHeader) { 
                    isHeader = false; // Skip header
                    continue;
                }


                batchCount++;
                totalRecords++;


                // Process the line (For demonstration, we just print every 100th line)
                if (batchCount == batchSize) {
                    System.out.println("Processed " + totalRecords + " records so far...");
                    batchCount = 0; // Reset batch count
                }
            }


            System.out.println("Total records processed: " + totalRecords);
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
