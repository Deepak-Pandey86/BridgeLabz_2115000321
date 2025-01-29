import java.util.Scanner;

public class SpringSeason {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking month and day as input
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();
        
        System.out.print("Enter the day (1-31): ");
        int day = scanner.nextInt();

        // Checking if it's a spring season
        if (isSpringSeason(month, day)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
        
        scanner.close();
    }

    // Method to check if the given date falls within Spring season
    public static boolean isSpringSeason(int month, int day) {
        // Check if the date is between March 20 and June 20 (inclusive)
        if ((month > 3 && month < 6) || (month == 3 && day >= 20) || (month == 6 && day <= 20)) {
            return true;
        }
        return false;
    }
}

