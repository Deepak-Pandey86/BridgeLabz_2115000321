import java.util.Scanner;

public class WordReplacer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a sentence from the user
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Input the word to replace
        System.out.print("Enter the word to replace: ");
        String oldWord = scanner.nextLine();

        // Input the new word
        System.out.print("Enter the new word: ");
        String newWord = scanner.nextLine();

        // Replace the word in the sentence
        String modifiedSentence = replaceWord(sentence, oldWord, newWord);

        // Display the modified sentence
        System.out.println("Modified Sentence: " + modifiedSentence);

        scanner.close();
    }

    // Method to replace a given word with another word in a sentence
    public static String replaceWord(String sentence, String oldWord, String newWord) {
        // Split the sentence into words
        String[] words = sentence.split("\\s+");
        StringBuilder result = new StringBuilder();

        // Iterate through each word in the sentence
        for (String word : words) {
            // Check if the current word matches the old word
            if (word.equals(oldWord)) {
                result.append(newWord); // Replace with the new word
            } else {
                result.append(word); // Keep the original word
            }
            result.append(" "); // Add a space after each word
        }

        return result.toString().trim(); // Convert StringBuilder to String and return, trimming any trailing spaces
    }
}
