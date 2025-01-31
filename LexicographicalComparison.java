import java.util.Scanner;

public class LexicographicalComparison {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two strings from the user
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Compare the two strings lexicographically
        int comparisonResult = compareStrings(str1, str2);

        // Display the result based on the comparison
        if (comparisonResult < 0) {
            System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order.");
        } else if (comparisonResult > 0) {
            System.out.println("\"" + str1 + "\" comes after \"" + str2 + "\" in lexicographical order.");
        } else {
            System.out.println("Both strings are equal.");
        }

        scanner.close();
    }

    // Method to compare two strings lexicographically
    public static int compareStrings(String str1, String str2) {
        int minLength = Math.min(str1.length(), str2.length());

        // Compare characters of both strings
        for (int i = 0; i < minLength; i++) {
            char char1 = str1.charAt(i);
            char char2 = str2.charAt(i);

            // Compare the characters
            if (char1 != char2) {
                return char1 - char2; // Return the difference between the characters
            }
        }

        // If all characters are the same up to the length of the shorter string
        return str1.length() - str2.length(); // Compare lengths if all characters are equal
    }
}
