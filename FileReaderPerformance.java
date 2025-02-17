import java.io.*;

public class FileReaderPerformance {
    public static void main(String[] args) throws IOException {
        String filePath = "/large.txt";
        long start, time;

        start = System.nanoTime();
        try (FileReader fileReader = new FileReader(filePath)) {
            char[] buffer = new char[1024];
            while (fileReader.read(buffer) != -1) {

            }
        }
        time = System.nanoTime() - start;
        System.out.println("FileReader Time: " + time / 1e6 + " ms");

        start = System.nanoTime();
        try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filePath))) {
            char[] buffer = new char[1024];
            while (inputStreamReader.read(buffer) != -1) {

            }
        }
        time = System.nanoTime() - start;
        System.out.println("InputStreamReader Time: " + time / 1e6 + " ms");
    }
}
