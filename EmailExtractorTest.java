import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


import java.util.List;
import java.util.regex.*;
import java.util.stream.Collectors;


class EmailExtractor {
    public static List<String> extractEmails(String text) {
        Pattern pattern = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
        Matcher matcher = pattern.matcher(text);
        return matcher.results().map(MatchResult::group).collect(Collectors.toList());
    }
}


class EmailExtractorTest {
    @Test
    void testExtractEmails() {
        String text = "Contact us at support@example.com and info@company.org";
        List<String> emails = EmailExtractor.extractEmails(text);
        assertEquals(List.of("support@example.com", "info@company.org"), emails);
    }


    @Test
    void testNoEmails() {
        String text = "No email addresses here!";
        List<String> emails = EmailExtractor.extractEmails(text);
        assertTrue(emails.isEmpty());
    }
}
