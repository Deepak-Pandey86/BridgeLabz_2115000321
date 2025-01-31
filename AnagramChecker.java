import java.util.Scanner;

public class AnagramChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two strings from the user
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Check if the two strings are anagrams
        boolean areAnagrams = checkAnagrams(str1, str2);

        // Display the result
        if (areAnagrams) {
            System.out.println("The strings are anagrams of each other.");
        } else {
            System.out.println("The strings are not anagrams of each other.");
        }

        scanner.close();
    }

    // Method to check if two strings are anagrams
    public static boolean checkAnagrams(String str1, String str2) {
        // Remove spaces and convert to lowercase for case-insensitive comparison
        str1 = str1.replaceAll("\\s+", "").toLowerCase();
        str2 = str2.replaceAll("\\s+", "").toLowerCase();

        // If lengths are different, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Create an array to count character frequencies
        int[] charCount = new int[26]; // Assuming only lowercase letters a-z

        // Count characters in the first string
        for (char ch : str1.toCharArray()) {
            charCount[ch - 'a']++;
        }

        // Decrease the count for characters in the second string
        for (char ch : str2.toCharArray()) {
            charCount[ch - 'a']--;
        }

        // Check if all counts are zero
        for (int count : charCount) {
            if (count != 0) {
                return false; // Not an anagram
            }
        }

        return true; // They are anagrams
    }
}
