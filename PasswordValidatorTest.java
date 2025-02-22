import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class PasswordValidator {
    public static boolean isValid(String password) {
        return password.length() >= 8 && 
               password.matches(".*[A-Z].*") && 
               password.matches(".*\\d.*");
    }
}


class PasswordValidatorTest {
    @Test
    void testValidPasswords() {
        assertTrue(PasswordValidator.isValid("StrongP@ss1"));
        assertTrue(PasswordValidator.isValid("Hello123"));
    }


    @Test
    void testInvalidPasswords() {
        assertFalse(PasswordValidator.isValid("short"));
        assertFalse(PasswordValidator.isValid("nouppercase1"));
        assertFalse(PasswordValidator.isValid("NOLOWERCASE1"));
        assertFalse(PasswordValidator.isValid("NoDigitsHere"));
    }
}
