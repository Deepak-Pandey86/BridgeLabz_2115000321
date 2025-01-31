import java.util.Scanner;

public class MostFrequentCharacter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a string from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Find the most frequent character
        char mostFrequentChar = findMostFrequentCharacter(input);

        // Display the result
        System.out.println("Most Frequent Character: '" + mostFrequentChar + "'");

        scanner.close();
    }

    // Method to find the most frequent character in a string
    public static char findMostFrequentCharacter(String str) {
        int[] frequency = new int[26]; // Array to store frequency of each character (assuming lowercase a-z)
        int maxFrequency = 0; // Variable to track the maximum frequency
        char mostFrequentChar = ' '; // Variable to store the most frequent character

        // Count the frequency of each character
        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') { // Check if the character is a lowercase letter
                frequency[ch - 'a']++; // Increment the frequency count for the character
            }
        }

        // Find the character with the maximum frequency
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > maxFrequency) {
                maxFrequency = frequency[i];
                mostFrequentChar = (char) (i + 'a'); // Convert index back to character
            }
        }

        return mostFrequentChar; // Return the most frequent character
    }
}

