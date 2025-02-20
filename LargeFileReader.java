import java.io.*;
import java.util.stream.Stream;


public class LargeFileReader {
    public static void main(String[] args) {
        String fileName = "largefile.txt"; 


        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            reader.lines()
                  .filter(line -> line.toLowerCase().contains("error"))
                  .forEach(System.out::println);


        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
