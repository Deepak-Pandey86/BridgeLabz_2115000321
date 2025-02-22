import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.regex.*;
import java.util.stream.Collectors;

class LinkExtractor {
    public static List<String> extractLinks(String text) {
        Pattern pattern = Pattern.compile("\\bhttps?://[a-zA-Z0-9._~:/?#\\[\\]@!$&'()*+,;=-]+\\b");
        Matcher matcher = pattern.matcher(text);
        return matcher.results().map(MatchResult::group).collect(Collectors.toList());
    }
}

class LinkExtractorTest {
    @Test
    void testExtractLinks() {
        String text = "Visit https://www.google.com and http://example.org for more info.";
        List<String> links = LinkExtractor.extractLinks(text);
        assertEquals(List.of("https://www.google.com", "http://example.org"), links);
    }

    @Test
    void testNoLinks() {
        String text = "This text has no links.";
        List<String> links = LinkExtractor.extractLinks(text);
        assertTrue(links.isEmpty());
    }
}
