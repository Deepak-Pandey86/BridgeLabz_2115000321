import java.util.Scanner;
 class LeapYearChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input year from user
        System.out.print("Enter a year (>= 1582): ");
        int year = sc.nextInt();
        if ((year >= 1582) && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
                System.out.println(year + " is a Leap Year.");
            } else if (year >= 1582) {
                System.out.println(year + " is not a Leap Year.");
            }
        
        
        sc.close();
    }
}