 import java.util.Scanner;

public class LeapYearCheckerFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input year from user
        System.out.print("Enter a year (>= 1582): ");
        int year = scanner.nextInt();
        
        // Check if the year is valid
        if (year < 1582) {
            System.out.println("Year must be greater than or equal to 1582.");
        }
      if ((year >= 1582) && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
                System.out.println(year + " is a Leap Year.");
            } else if (year >= 1582) {
                System.out.println(year + " is not a Leap Year.");
            }
        }
        
        scanner.close();
    }
}