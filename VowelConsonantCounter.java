import java.util.Scanner;

public class VowelConsonantCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a string from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Call the method to count vowels and consonants
        int[] counts = countVowelsAndConsonants(input);
        int vowelCount = counts[0];
        int consonantCount = counts[1];

        // Display the results
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);

        scanner.close();
    }

    // Method to count vowels and consonants
    public static int[] countVowelsAndConsonants(String str) {
        int vowels = 0;
        int consonants = 0;

        // Convert the string to lower case to make the check case-insensitive
        str = str.toLowerCase();

        // Iterate through each character in the string
        for (char ch : str.toCharArray()) {
            // Check if the character is a letter
            if (Character.isLetter(ch)) {
                // Check if the character is a vowel
                if (isVowel(ch)) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        return new int[]{vowels, consonants};
    }

    // Method to check if a character is a vowel
    public static boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) != -1;
    }
}
