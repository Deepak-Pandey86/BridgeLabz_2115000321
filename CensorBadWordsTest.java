import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


import java.util.List;
import java.util.regex.Pattern;


class CensorBadWords {
    public static String censorText(String text, List<String> badWords) {
        for (String word : badWords) {
            String regex = "\\b" + Pattern.quote(word) + "\\b";
            text = text.replaceAll(regex, "****");
        }
        return text;
    }
}


class CensorBadWordsTest {
    @Test
    void testCensorBadWords() {
        List<String> badWords = List.of("damn", "stupid");
        String input = "This is a damn bad example with some stupid words.";
        String expected = "This is a **** bad example with some **** words.";
        assertEquals(expected, CensorBadWords.censorText(input, badWords));
    }


    @Test
    void testNoBadWords() {
        List<String> badWords = List.of("rude", "offensive");
        String input = "This is a clean sentence.";
        assertEquals("This is a clean sentence.", CensorBadWords.censorText(input, badWords));
    }
}
