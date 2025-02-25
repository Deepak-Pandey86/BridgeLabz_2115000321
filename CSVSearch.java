import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class CSVSearch {
    public static void main(String[] args) {
        String filePath = "employees.csv"; // CSV file containing employee records
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter employee name to search: ");
        String searchName = scanner.nextLine().trim();


        boolean found = false;


        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean isHeader = true;


            while ((line = br.readLine()) != null) {
                if (isHeader) { // Skip the header row
                    isHeader = false;
                    continue;
                }


                String[] data = line.split(","); // Splitting CSV values
                String name = data[1].trim();   // Assuming Name is in the 2nd column
                String department = data[2].trim();
                String salary = data[3].trim();


                if (name.equalsIgnoreCase(searchName)) { // Case-insensitive comparison
                    System.out.println("Employee Found:");
                    System.out.println("Department: " + department);
                    System.out.println("Salary: " + salary);
                    found = true;
                    break;
                }
            }


            if (!found) {
                System.out.println("Employee not found!");
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
        scanner.close();
    }
}
