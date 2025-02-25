import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class CSVFilter {
    public static void main(String[] args) {
        String filePath = "students.csv"; // CSV file containing student records


        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean isHeader = true;


            while ((line = br.readLine()) != null) {
                if (isHeader) {
                    System.out.println("Filtered Students (Marks > 80):");
                    System.out.println(line); // Print the header
                    isHeader = false;
                    continue;
                }


                String[] data = line.split(","); // Splitting CSV values
                int marks = Integer.parseInt(data[3].trim()); // Assuming marks are in the 4th column


                if (marks > 80) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
