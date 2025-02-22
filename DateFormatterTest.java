import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;


class DateFormatter {
    public static String formatDate(String inputDate) {
        try {
            LocalDate date = LocalDate.parse(inputDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            return date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Invalid date format");
        }
    }
}


class DateFormatterTest {
    @Test
    void testValidDateFormat() {
        assertEquals("15-03-2024", DateFormatter.formatDate("2024-03-15"));
        assertEquals("01-01-2000", DateFormatter.formatDate("2000-01-01"));
    }


    @Test
    void testInvalidDateFormat() {
        assertThrows(IllegalArgumentException.class, () -> DateFormatter.formatDate("15-03-2024"));
        assertThrows(IllegalArgumentException.class, () -> DateFormatter.formatDate("2024/03/15"));
        assertThrows(IllegalArgumentException.class, () -> DateFormatter.formatDate("invalid-date"));
    }
}
