import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;
import java.nio.file.*;


class FileProcessor {
    public static void writeToFile(String filename, String content) throws IOException {
        Files.write(Paths.get(filename), content.getBytes());
    }


    public static String readFromFile(String filename) throws IOException {
        return Files.readString(Paths.get(filename));
    }
}


class FileProcessorTest {
    private static final String TEST_FILE = "testfile.txt";


    @BeforeEach
    void setUp() throws IOException {
        Files.deleteIfExists(Paths.get(TEST_FILE));
    }


    @Test
    void testWriteAndReadFile() throws IOException {
        String content = "Hello, File!";
        FileProcessor.writeToFile(TEST_FILE, content);
        assertEquals(content, FileProcessor.readFromFile(TEST_FILE));
    }


    @Test
    void testFileExistsAfterWriting() throws IOException {
        FileProcessor.writeToFile(TEST_FILE, "Sample content");
        assertTrue(Files.exists(Paths.get(TEST_FILE)));
    }


    @Test
    void testReadNonExistentFileThrowsException() {
        assertThrows(IOException.class, () -> FileProcessor.readFromFile("nonexistent.txt"));
    }


    @AfterEach
    void tearDown() throws IOException {
        Files.deleteIfExists(Paths.get(TEST_FILE));
    }
}
