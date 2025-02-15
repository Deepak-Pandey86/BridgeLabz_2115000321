import java.io.*;

public class WordCountUsingFilReader {
    public static void main(String[] args) throws IOException {
        String targetWord = "example";
        int count = 0;
        
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] words = line.split("\\s+");
            for (String word : words) {
                if (word.equals(targetWord)) {
                    count++;
                }
            }
        }
        reader.close();
        
        System.out.println("The word \"" + targetWord + "\" appears " + count + " times.");
    }
}
