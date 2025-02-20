import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;


public class FileCopyComparison {
    private static final int BUFFER_SIZE = 4096;
    private static final String SOURCE_FILE = "largefile.bin"; // Change this to your file path
    private static final String BUFFERED_DEST_FILE = "buffered_copy.bin";
    private static final String UNBUFFERED_DEST_FILE = "unbuffered_copy.bin";


    public static void main(String[] args) {
        System.out.println("Copying file using Buffered Streams...");
        long bufferedTime = measureTime(() -> copyFileBuffered(SOURCE_FILE, BUFFERED_DEST_FILE));
        System.out.println("Buffered Streams Time: " + bufferedTime + " ns\n");


        System.out.println("Copying file using Unbuffered Streams...");
        long unbufferedTime = measureTime(() -> copyFileUnbuffered(SOURCE_FILE, UNBUFFERED_DEST_FILE));
        System.out.println("Unbuffered Streams Time: " + unbufferedTime + " ns\n");


        System.out.println("Performance Improvement: " + (double) unbufferedTime / bufferedTime + "x faster using Buffered Streams.");
    }


    private static void copyFileBuffered(String source, String destination) {
        try (BufferedInputStream bis = new BufferedInputStream(Files.newInputStream(Paths.get(source)));
             BufferedOutputStream bos = new BufferedOutputStream(Files.newOutputStream(Paths.get(destination)))) {


            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            System.out.println("Error copying file: " + e.getMessage());
        }
    }


    private static void copyFileUnbuffered(String source, String destination) {
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(destination)) {


            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }
        } catch (IOException e) {
            System.out.println("Error copying file: " + e.getMessage());
        }
    }


    private static long measureTime(Runnable task) {
        long startTime = System.nanoTime();
        task.run();
        return System.nanoTime() - startTime;
    }
}
