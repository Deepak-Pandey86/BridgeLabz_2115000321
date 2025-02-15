import java.io.*;

public class UserInputToFileUsngInputStreamReader {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

        String line;
        while (!(line = reader.readLine()).equalsIgnoreCase("exit")) {
            writer.write(line);
            writer.newLine();
        }

        reader.close();
        writer.close();
    }
}

