import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Define a date format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
        // Input a date from the user
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String inputDate = scanner.nextLine();
        
        // Parse the input date
        LocalDate date = LocalDate.parse(inputDate, formatter);
        
        // Perform date arithmetic
        LocalDate newDate = date.plusDays(7) // Add 7 days
                                 .plusMonths(1) // Add 1 month
                                 .plusYears(2) // Add 2 years
                                 .minusWeeks(3); // Subtract 3 weeks
        
        // Display the result
        System.out.println("Original Date: " + date.format(formatter));
        System.out.println("New Date after arithmetic: " + newDate.format(formatter));
        
        scanner.close();
    }
}
