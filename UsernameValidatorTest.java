import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


import java.util.regex.Pattern;


class UsernameValidator {
    public static boolean isValidUsername(String username) {
        return username.matches("^[A-Za-z][A-Za-z0-9_]{4,14}$");
    }
}


class UsernameValidatorTest {
    @Test
    void testValidUsernames() {
        assertTrue(UsernameValidator.isValidUsername("user_123"));
        assertTrue(UsernameValidator.isValidUsername("UserName99"));
        assertTrue(UsernameValidator.isValidUsername("Valid_123"));
    }


    @Test
    void testInvalidUsernames() {
        assertFalse(UsernameValidator.isValidUsername("123user"));
        assertFalse(UsernameValidator.isValidUsername("us"));
        assertFalse(UsernameValidator.isValidUsername("user@name"));
        assertFalse(UsernameValidator.isValidUsername("a_very_long_username_exceeding_limit"));
    }
}
