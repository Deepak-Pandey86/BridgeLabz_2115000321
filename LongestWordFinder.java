import java.util.Scanner;

public class LongestWordFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a sentence from the user
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        // Find the longest word
        String longestWord = findLongestWord(input);

        // Display the longest word
        System.out.println("The longest word is: " + longestWord);

        scanner.close();
    }

    // Method to find the longest word in a sentence
    public static String findLongestWord(String sentence) {
        String[] words = sentence.split("\\s+"); // Split the sentence into words
        String longestWord = ""; // Variable to store the longest word

        for (String word : words) {
            // Check if the current word is longer than the longest found so far
            if (word.length() > longestWord.length()) {
                longestWord = word; // Update the longest word
            }
        }

        return longestWord; // Return the longest word found
    }
}
