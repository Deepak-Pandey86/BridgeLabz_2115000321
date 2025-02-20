import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;


public class ImageByteArrayConverter {
    public static void main(String[] args) {
        String inputImagePath = "input.jpg";
        String outputImagePath = "output.jpg";


        try {
            byte[] imageData = Files.readAllBytes(Paths.get(inputImagePath));
            Files.write(Paths.get(outputImagePath), imageData);
            System.out.println("Image conversion completed successfully!");
        } catch (IOException e) {
            System.out.println("Error processing image: " + e.getMessage());
        }
    }
}
