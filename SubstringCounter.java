import java.util.Scanner;

public class SubstringCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the main string from the user
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();

        // Input the substring to search for
        System.out.print("Enter the substring to count: ");
        String substring = scanner.nextLine();

        // Count occurrences of the substring
        int count = countSubstringOccurrences(mainString, substring);

        // Display the result
        System.out.println("The substring \"" + substring + "\" occurs " + count + " times in the main string.");

        scanner.close();
    }

    // Method to count occurrences of a substring in a string
    public static int countSubstringOccurrences(String mainString, String substring) {
        int count = 0;
        int index = 0;

        // Loop to find all occurrences of the substring
        while ((index = mainString.indexOf(substring, index)) != -1) {
            count++; // Increment count for each occurrence
            index += substring.length(); // Move index forward to avoid counting the same occurrence
        }

        return count; // Return the total count
    }
}
