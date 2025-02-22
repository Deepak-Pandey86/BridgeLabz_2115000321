import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class HexColorValidator {
    public static boolean isValidHexColor(String color) {
        return color.matches("^#[0-9A-Fa-f]{6}$");
    }
}


class HexColorValidatorTest {
    @Test
    void testValidHexColors() {
        assertTrue(HexColorValidator.isValidHexColor("#FFA500"));
        assertTrue(HexColorValidator.isValidHexColor("#ff4500"));
        assertTrue(HexColorValidator.isValidHexColor("#00FF00"));
    }


    @Test
    void testInvalidHexColors() {
        assertFalse(HexColorValidator.isValidHexColor("#123"));
        assertFalse(HexColorValidator.isValidHexColor("FFA500"));
        assertFalse(HexColorValidator.isValidHexColor("#GGGGGG"));
        assertFalse(HexColorValidator.isValidHexColor("#1234567"));
    }
}
