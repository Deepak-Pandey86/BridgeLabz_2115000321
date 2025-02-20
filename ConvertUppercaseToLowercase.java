import java.io.*;


public class ConvertUppercaseToLowercase {
    public static void main(String[] args) {
        String inputFile = "input.txt";   // Input file
        String outputFile = "output.txt"; // Output file


        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {


            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line.toLowerCase()); // Convert to lowercase
                writer.newLine(); // Maintain line structure
            }


            System.out.println("Conversion completed. Check " + outputFile);


        } catch (IOException e) {
            System.out.println("Error processing file: " + e.getMessage());
        }
    }
}
