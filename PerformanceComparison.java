import java.io.*;
import java.util.StringTokenizer;

public class PerformanceComparison {
    public static void main(String[] args) throws IOException {
        compareStringBuilderAndStringBuffer();
        compareFileReaderAndInputStreamReader();
    }

    private static void compareStringBuilderAndStringBuffer() {
        String text = "hello";
        int iterations = 1_000_000;

        long startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append(text);
        }
        long sbTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        StringBuffer sf = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sf.append(text);
        }
        long sfTime = System.nanoTime() - startTime;

        System.out.println("StringBuilder Time: " + sbTime / 1_000_000 + " ms");
        System.out.println("StringBuffer Time: " + sfTime / 1_000_000 + " ms");
    }

    private static void compareFileReaderAndInputStreamReader() throws IOException {
        File file = new File("largefile.txt");

        long startTime = System.nanoTime();
        BufferedReader frReader = new BufferedReader(new FileReader(file));
        long wordCount = countWords(frReader);
        long frTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        BufferedReader isrReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        long wordCount2 = countWords(isrReader);
        long isrTime = System.nanoTime() - startTime;

        System.out.println("FileReader Word Count: " + wordCount + ", Time: " + frTime / 1_000_000 + " ms");
        System.out.println("InputStreamReader Word Count: " + wordCount2 + ", Time: " + isrTime / 1_000_000 + " ms");
    }

    private static long countWords(BufferedReader reader) throws IOException {
        long count = 0;
        String line;
        while ((line = reader.readLine()) != null) {
            StringTokenizer tokenizer = new StringTokenizer(line);
            count += tokenizer.countTokens();
        }
        reader.close();
        return count;
    }
}
