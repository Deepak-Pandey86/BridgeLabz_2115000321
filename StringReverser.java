import java.util.Scanner;

public class StringReverser {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a string from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Reverse the string
        String reversedString = reverseString(input);

        // Display the reversed string
        System.out.println("Reversed string: " + reversedString);

        scanner.close();
    }

    // Method to reverse a string
    public static String reverseString(String str) {
        char[] charArray = new char[str.length()]; // Create a character array to hold the reversed string
        int index = 0;

        // Loop through the string in reverse order
        for (int i = str.length() - 1; i >= 0; i--) {
            charArray[index] = str.charAt(i); // Assign characters in reverse order
            index++;
        }

        return new String(charArray); // Convert the character array back to a string
    }
}

