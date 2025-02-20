import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;


public class UserInputToFile {
    public static void main(String[] args) {
        String fileName = "user_data.txt";


        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = Files.newBufferedWriter(Paths.get(fileName))) {


            System.out.print("Enter your name: ");
            String name = reader.readLine();


            System.out.print("Enter your age: ");
            String age = reader.readLine();


            System.out.print("Enter your favorite programming language: ");
            String language = reader.readLine();


            writer.write("Name: " + name);
            writer.newLine();
            writer.write("Age: " + age);
            writer.newLine();
            writer.write("Favorite Language: " + language);
            writer.newLine();


            System.out.println("User information saved to " + fileName);


        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
