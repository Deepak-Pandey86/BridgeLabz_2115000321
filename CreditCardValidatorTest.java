import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class CreditCardValidator {
    public static boolean isValidCreditCard(String cardNumber) {
        return cardNumber.matches("^4\\d{15}$") || cardNumber.matches("^5\\d{15}$");
    }
}


class CreditCardValidatorTest {
    @Test
    void testValidCreditCards() {
        assertTrue(CreditCardValidator.isValidCreditCard("4111111111111111")); // Visa
        assertTrue(CreditCardValidator.isValidCreditCard("5111111111111111")); // MasterCard
    }


    @Test
    void testInvalidCreditCards() {
        assertFalse(CreditCardValidator.isValidCreditCard("6111111111111111")); // Invalid prefix
        assertFalse(CreditCardValidator.isValidCreditCard("411111111111")); // Too short
        assertFalse(CreditCardValidator.isValidCreditCard("511111111111111")); // Too short
        assertFalse(CreditCardValidator.isValidCreditCard("41111111111111112")); // Too long
        assertFalse(CreditCardValidator.isValidCreditCard("5111a11111111111")); // Contains letters
    }
}
