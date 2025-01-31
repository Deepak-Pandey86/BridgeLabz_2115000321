import java.util.Scanner;

public class RemoveCharacter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a string from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Input the character to remove
        System.out.print("Character to remove: ");
        char charToRemove = scanner.next().charAt(0);

        // Remove all occurrences of the specified character
        String modifiedString = removeCharacter(input, charToRemove);

        // Display the modified string
        System.out.println("Modified String: " + modifiedString);

        scanner.close();
    }

    // Method to remove all occurrences of a specific character from a string
    public static String removeCharacter(String str, char ch) {
        StringBuilder result = new StringBuilder(); // StringBuilder to store the result

        // Iterate through each character in the string
        for (char currentChar : str.toCharArray()) {
            // If the current character is not the one to remove, append it to the result
            if (currentChar != ch) {
                result.append(currentChar);
            }
        }

        return result.toString(); // Convert StringBuilder to String and return
    }
}
