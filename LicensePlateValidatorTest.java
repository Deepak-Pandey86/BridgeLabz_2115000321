import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class LicensePlateValidator {
    public static boolean isValidLicensePlate(String plate) {
        return plate.matches("^[A-Z]{2}\\d{4}$");
    }
}


class LicensePlateValidatorTest {
    @Test
    void testValidLicensePlates() {
        assertTrue(LicensePlateValidator.isValidLicensePlate("AB1234"));
        assertTrue(LicensePlateValidator.isValidLicensePlate("XY5678"));
    }


    @Test
    void testInvalidLicensePlates() {
        assertFalse(LicensePlateValidator.isValidLicensePlate("A12345"));
        assertFalse(LicensePlateValidator.isValidLicensePlate("ABC123"));
        assertFalse(LicensePlateValidator.isValidLicensePlate("ab1234"));
        assertFalse(LicensePlateValidator.isValidLicensePlate("1234AB"));
        assertFalse(LicensePlateValidator.isValidLicensePlate("XY12"));
    }
}
