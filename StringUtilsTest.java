

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class StringUtils {
    // Method to reverse a string
    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }


    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        String reversed = reverse(str);
        return str.equalsIgnoreCase(reversed);
    }


    // Method to convert a string to uppercase
    public static String toUpperCase(String str) {
        return str.toUpperCase();
    }
}


// JUnit Test Class
class StringUtilsTest {
    @Test
    void testReverse() {
        assertEquals("olleh", StringUtils.reverse("hello"));
        assertEquals("987654321", StringUtils.reverse("123456789"));
    }


    @Test
    void testIsPalindrome() {
        assertTrue(StringUtils.isPalindrome("madam"));
        assertTrue(StringUtils.isPalindrome("racecar"));
        assertFalse(StringUtils.isPalindrome("hello"));
    }


    @Test
    void testToUpperCase() {
        assertEquals("HELLO", StringUtils.toUpperCase("hello"));
        assertEquals("JAVA", StringUtils.toUpperCase("java"));
    }
}
