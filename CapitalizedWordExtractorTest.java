import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


import java.util.List;
import java.util.regex.*;
import java.util.stream.Collectors;


class CapitalizedWordExtractor {
    public static List<String> extractCapitalizedWords(String text) {
        Pattern pattern = Pattern.compile("\\b[A-Z][a-z]*\\b");
        Matcher matcher = pattern.matcher(text);
        return matcher.results().map(MatchResult::group).collect(Collectors.toList());
    }
}


class CapitalizedWordExtractorTest {
    @Test
    void testExtractCapitalizedWords() {
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        List<String> words = CapitalizedWordExtractor.extractCapitalizedWords(text);
        assertEquals(List.of("Eiffel", "Tower", "Paris", "Statue", "Liberty", "New", "York"), words);
    }


    @Test
    void testNoCapitalizedWords() {
        String text = "this sentence has no capitalized words.";
        List<String> words = CapitalizedWordExtractor.extractCapitalizedWords(text);
        assertTrue(words.isEmpty());
    }
}
