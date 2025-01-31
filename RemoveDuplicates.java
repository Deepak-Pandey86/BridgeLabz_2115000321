import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a string from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Remove duplicate characters
        String result = removeDuplicates(input);

        // Display the modified string
        System.out.println("String after removing duplicates: " + result);

        scanner.close();
    }

    // Method to remove duplicate characters from a string
    public static String removeDuplicates(String str) {
        StringBuilder result = new StringBuilder(); // StringBuilder to store the result
        boolean[] seen = new boolean[256]; // Array to track seen characters

        for (char ch : str.toCharArray()) {
            // Check if the character has already been seen
            if (!seen[ch]) {
                seen[ch] = true; // Mark the character as seen
                result.append(ch); // Append the character to the result
            }
        }

        return result.toString(); // Convert StringBuilder to String and return
    }
}
