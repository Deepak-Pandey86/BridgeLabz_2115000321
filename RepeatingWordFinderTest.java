import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


import java.util.*;
import java.util.regex.*;
import java.util.stream.Collectors;


class RepeatingWordFinder {
    public static Set<String> findRepeatingWords(String text) {
        Pattern pattern = Pattern.compile("\\b(\\w+)\\b(?:\\s+\\1\\b)");
        Matcher matcher = pattern.matcher(text);
        Set<String> repeatingWords = new HashSet<>();
        while (matcher.find()) {
            repeatingWords.add(matcher.group(1));
        }
        return repeatingWords;
    }
}


class RepeatingWordFinderTest {
    @Test
    void testFindRepeatingWords() {
        String text = "This is is a repeated repeated word test.";
        Set<String> repeatingWords = RepeatingWordFinder.findRepeatingWords(text);
        assertEquals(Set.of("is", "repeated"), repeatingWords);
    }


    @Test
    void testNoRepeatingWords() {
        String text = "Each word appears only once.";
        Set<String> repeatingWords = RepeatingWordFinder.findRepeatingWords(text);
        assertTrue(repeatingWords.isEmpty());
    }
}
