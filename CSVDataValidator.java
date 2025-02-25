import java.io.*;
import java.util.regex.*;


public class CSVDataValidator {
    public static void main(String[] args) {
        String inputFile = "employees.csv";
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$"; // Email validation pattern
        String phoneRegex = "^\\d{10}$"; // Phone number should have exactly 10 digits


        Pattern emailPattern = Pattern.compile(emailRegex);
        Pattern phonePattern = Pattern.compile(phoneRegex);


        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String line;
            boolean isHeader = true;


            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");
                if (isHeader) {
                    isHeader = false;
                    continue; // Skip header row
                }


                String id = fields[0].trim();
                String name = fields[1].trim();
                String email = fields[2].trim();
                String phone = fields[3].trim();


                boolean isEmailValid = emailPattern.matcher(email).matches();
                boolean isPhoneValid = phonePattern.matcher(phone).matches();


                if (!isEmailValid || !isPhoneValid) {
                    System.out.println("Invalid Record: " + line);
                    if (!isEmailValid) System.out.println("  ❌ Invalid Email: " + email);
                    if (!isPhoneValid) System.out.println("  ❌ Invalid Phone: " + phone);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
