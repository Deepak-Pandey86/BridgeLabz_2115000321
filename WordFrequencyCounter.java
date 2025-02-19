import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        String filePath = "input.txt";
        HashMap<String, Integer> wordCount = new HashMap<>();
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line;
        
        while ((line = br.readLine()) != null) {
            String[] words = line.toLowerCase().replaceAll("[^a-zA-Z ]", "").split("\\s+");
            for (String word : words) {
                if (!word.isEmpty()) {
                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                }
            }
        }
        br.close();
        System.out.println(wordCount);
    }
}
