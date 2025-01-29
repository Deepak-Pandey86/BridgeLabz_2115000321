import java.util.Scanner;

public class LeapYearChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take user input for the year
        System.out.print("Enter a year (>= 1582): ");
        int year = scanner.nextInt();
        
        // Check if the year is valid
        if (year < 1582) {
            System.out.println("Year must be 1582 or later.");
        } else {
            // Check if the year is a leap year
            if (isLeapYear(year)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        }
        
        scanner.close();
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        // A year is a leap year if it is divisible by 4
        // but not divisible by 100, unless it is also divisible by 400
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
