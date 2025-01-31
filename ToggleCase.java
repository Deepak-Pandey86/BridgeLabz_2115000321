import java.util.Scanner;

public class ToggleCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a string from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Toggle the case of each character
        String toggledString = toggleCase(input);

        // Display the result
        System.out.println("String after toggling case: " + toggledString);

        scanner.close();
    }

    // Method to toggle the case of each character in a string
    public static String toggleCase(String str) {
        StringBuilder toggled = new StringBuilder(); // StringBuilder to store the toggled string

        for (char ch : str.toCharArray()) {
            // Check if the character is uppercase
            if (Character.isUpperCase(ch)) {
                toggled.append(Character.toLowerCase(ch)); // Convert to lowercase
            } else if (Character.isLowerCase(ch)) {
                toggled.append(Character.toUpperCase(ch)); // Convert to uppercase
            } else {
                toggled.append(ch); // Keep non-alphabetic characters unchanged
            }
        }

        return toggled.toString(); // Convert StringBuilder to String and return
    }
}
