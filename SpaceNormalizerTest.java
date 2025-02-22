import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class SpaceNormalizer {
    public static String replaceMultipleSpaces(String text) {
        return text.replaceAll("\\s+", " ");
    }
}


class SpaceNormalizerTest {
    @Test
    void testReplaceMultipleSpaces() {
        assertEquals("This is an example with multiple spaces.", 
                     SpaceNormalizer.replaceMultipleSpaces("This  is   an   example    with multiple   spaces."));
        assertEquals("Hello World!", SpaceNormalizer.replaceMultipleSpaces("Hello    World!"));
    }


    @Test
    void testNoExtraSpaces() {
        assertEquals("No extra spaces here.", SpaceNormalizer.replaceMultipleSpaces("No extra spaces here."));
    }
}


