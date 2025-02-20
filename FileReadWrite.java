import java.io.*;


public class FileReadWrite {
    private static final String SOURCE_FILE = "source.txt";  
    private static final String DEST_FILE = "destination.txt"; 


    public static void main(String[] args) {
        copyFile(SOURCE_FILE, DEST_FILE);
    }


    private static void copyFile(String source, String destination) {
        File inputFile = new File(source);
        if (!inputFile.exists()) {
            System.out.println("Error: Source file does not exist.");
            return;
        }


        try (FileInputStream fis = new FileInputStream(inputFile);
             FileOutputStream fos = new FileOutputStream(destination)) {


            byte[] buffer = new byte[4096]; 
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }


            System.out.println("File copied successfully to " + destination);


        } catch (IOException e) {
            System.out.println("Error handling file: " + e.getMessage());
        }
    }
}


