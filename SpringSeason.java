public class SpringSeason {
    public static void main(String[] args) {
        // Check if the correct number of arguments is provided
        if (args.length != 2) {
            System.out.println("Please provide two integer values: month and day.");
            return;
        }

        // Parse the command line arguments
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Check if the date falls within the Spring season
        boolean isSpring = false;

        if (month == 3 && day >= 20) {
            isSpring = true; // From March 20 onwards
        } else if (month > 3 && month < 6) {
            isSpring = true; // From April 1 to May 31
        } else if (month == 6 && day <= 20) {
            isSpring = true; // Up to June 20
        }

        // Output the result
        if (isSpring) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }
    }
}