import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class WordCounter {
    public static void main(String[] args) {
        String fileName = "example.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            Map<String, Integer> wordCountMap = reader.lines()
                    .flatMap(line -> Arrays.stream(line.toLowerCase().split("\\W+")))
                    .filter(word -> !word.isEmpty())
                    .collect(Collectors.toMap(word -> word, word -> 1, Integer::sum));

            List<Map.Entry<String, Integer>> sortedWords = wordCountMap.entrySet().stream()
                    .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                    .limit(5)
                    .collect(Collectors.toList());

            int totalWords = wordCountMap.values().stream().mapToInt(Integer::intValue).sum();
            System.out.println("Total words in file: " + totalWords);
            sortedWords.forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
