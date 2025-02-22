import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


import java.util.List;
import java.util.regex.*;
import java.util.stream.Collectors;


class CurrencyExtractor {
    public static List<String> extractCurrencyValues(String text) {
        Pattern pattern = Pattern.compile("\\$?\\d+\\.\\d{2}");
        Matcher matcher = pattern.matcher(text);
        return matcher.results().map(MatchResult::group).collect(Collectors.toList());
    }
}


class CurrencyExtractorTest {
    @Test
    void testExtractCurrencyValues() {
        String text = "The price is $45.99, and the discount is 10.50.";
        List<String> values = CurrencyExtractor.extractCurrencyValues(text);
        assertEquals(List.of("$45.99", "10.50"), values);
    }


    @Test
    void testNoCurrencyValues() {
        String text = "There are no prices mentioned here.";
        List<String> values = CurrencyExtractor.extractCurrencyValues(text);
        assertTrue(values.isEmpty());
    }
}
