public class DayOfWeek {
    public static void main(String[] args) {
        // Check if the correct number of arguments is provided
        if (args.length != 3) {
            System.out.println("Usage: java DayOfWeek <month> <day> <year>");
            return;
        }

        // Parse the command-line arguments
        int m = Integer.parseInt(args[0]); // Month
        int d = Integer.parseInt(args[1]); // Day
        int y = Integer.parseInt(args[2]); // Year

        // Calculate y0
        int y0 = y - (14 - m) / 12;

        // Calculate x
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;

        // Calculate m0
        int m0 = m + 12 * ((14 - m) / 12) - 2;

        // Calculate d0
        int d0 = (d + x + 31 * m0 / 12) % 7;

        // Print the result
        System.out.println("The day of the week is: " + d0);
    }
}
