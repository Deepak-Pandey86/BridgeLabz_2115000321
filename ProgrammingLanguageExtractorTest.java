import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


import java.util.List;
import java.util.regex.*;
import java.util.stream.Collectors;


class ProgrammingLanguageExtractor {
    public static List<String> extractLanguages(String text) {
        Pattern pattern = Pattern.compile("\\b(JavaScript|Java|Python|Go|C\\+\\+|C#|Ruby|Swift|Kotlin|PHP|TypeScript)\\b");
        Matcher matcher = pattern.matcher(text);
        return matcher.results().map(MatchResult::group).collect(Collectors.toList());
    }
}


class ProgrammingLanguageExtractorTest {
    @Test
    void testExtractLanguages() {
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        List<String> languages = ProgrammingLanguageExtractor.extractLanguages(text);
        assertEquals(List.of("Java", "Python", "JavaScript", "Go"), languages);
    }


    @Test
    void testNoLanguages() {
        String text = "I enjoy painting and cooking in my free time.";
        List<String> languages = ProgrammingLanguageExtractor.extractLanguages(text);
        assertTrue(languages.isEmpty());
    }
}
