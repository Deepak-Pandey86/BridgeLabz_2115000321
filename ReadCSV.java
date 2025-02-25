import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ReadCSV {
    public static void main(String[] args) {
        String filePath = "students.csv"; // Change this to your CSV file path


        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            System.out.println("ID   | Name       | Age | Marks");
            System.out.println("--------------------------------");


            while ((line = br.readLine()) != null) {
                String[] data = line.split(","); // Splitting data by comma
                System.out.printf("%-4s | %-10s | %-3s | %-5s%n", data[0], data[1], data[2], data[3]);
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
