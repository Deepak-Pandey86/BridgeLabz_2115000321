import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


import java.util.regex.*;


class SSNValidator {
    public static boolean isValidSSN(String ssn) {
        return ssn.matches("^\\d{3}-\\d{2}-\\d{4}$");
    }
}


class SSNValidatorTest {
    @Test
    void testValidSSN() {
        assertTrue(SSNValidator.isValidSSN("123-45-6789"));
    }


    @Test
    void testInvalidSSN() {
        assertFalse(SSNValidator.isValidSSN("123456789")); // Missing dashes
        assertFalse(SSNValidator.isValidSSN("123-456-789")); // Incorrect format
        assertFalse(SSNValidator.isValidSSN("12-34-5678")); // Too short
        assertFalse(SSNValidator.isValidSSN("123-45-67890")); // Too long
    }
}
