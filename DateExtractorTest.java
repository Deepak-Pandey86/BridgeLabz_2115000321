import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


import java.util.List;
import java.util.regex.*;
import java.util.stream.Collectors;


class DateExtractor {
    public static List<String> extractDates(String text) {
        Pattern pattern = Pattern.compile("\\b\\d{2}/\\d{2}/\\d{4}\\b");
        Matcher matcher = pattern.matcher(text);
        return matcher.results().map(MatchResult::group).collect(Collectors.toList());
    }
}


class DateExtractorTest {
    @Test
    void testExtractDates() {
        String text = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
        List<String> dates = DateExtractor.extractDates(text);
        assertEquals(List.of("12/05/2023", "15/08/2024", "29/02/2020"), dates);
    }


    @Test
    void testNoDates() {
        String text = "There are no dates in this text.";
        List<String> dates = DateExtractor.extractDates(text);
        assertTrue(dates.isEmpty());
    }
}
