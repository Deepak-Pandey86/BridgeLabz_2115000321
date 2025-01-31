import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a string from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Check if the string is a palindrome
        boolean isPalindrome = checkPalindrome(input);

        // Display the result
        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        scanner.close();
    }

    // Method to check if a string is a palindrome
    public static boolean checkPalindrome(String str) {
        int left = 0; // Start pointer
        int right = str.length() - 1; // End pointer

        // Compare characters from both ends
        while (left < right) {
            // If characters do not match, it's not a palindrome
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++; // Move the left pointer to the right
            right--; // Move the right pointer to the left
        }
        return true; // If all characters matched, it's a palindrome
    }
}
