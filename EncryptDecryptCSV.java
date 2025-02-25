import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class EncryptDecryptCSV {
    private static SecretKey secretKey;


    public static void main(String[] args) throws Exception {
        secretKey = generateKey(); // Generate AES Key
        String csvFile = "employees.csv";
        String encryptedFile = "encrypted_employees.csv";
        String decryptedFile = "decrypted_employees.csv";


        List<String[]> data = new ArrayList<>();
        data.add(new String[]{"ID", "Name", "Salary", "Email"});
        data.add(new String[]{"1", "Alice", "50000", "alice@example.com"});
        data.add(new String[]{"2", "Bob", "60000", "bob@example.com"});
        data.add(new String[]{"3", "Charlie", "55000", "charlie@example.com"});


        writeEncryptedCSV(encryptedFile, data);
        readDecryptedCSV(encryptedFile, decryptedFile);
    }


    // Generate AES Key
    public static SecretKey generateKey() throws Exception {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(128);
        return keyGenerator.generateKey();
    }


    // Encrypt data using AES
    public static String encrypt(String data) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        return new String(cipher.doFinal(data.getBytes()), "ISO-8859-1");
    }


    // Decrypt data using AES
    public static String decrypt(String encryptedData) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        return new String(cipher.doFinal(encryptedData.getBytes("ISO-8859-1")));
    }


    // Write encrypted data to CSV
    public static void writeEncryptedCSV(String filename, List<String[]> data) throws Exception {
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(filename))) {
            for (int i = 0; i < data.size(); i++) {
                String[] row = data.get(i);
                if (i > 0) { // Encrypt only data rows, not headers
                    row[2] = encrypt(row[2]); // Encrypt Salary
                    row[3] = encrypt(row[3]); // Encrypt Email
                }
                writer.write(String.join(",", row));
                writer.newLine();
            }
        }
        System.out.println("Encrypted CSV saved: " + filename);
    }


    // Read encrypted CSV and decrypt sensitive fields
    public static void readDecryptedCSV(String inputFile, String outputFile) throws Exception {
        List<String[]> decryptedData = new ArrayList<>();


        try (BufferedReader reader = Files.newBufferedReader(Paths.get(inputFile))) {
            String line;
            int rowNum = 0;
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(",");
                if (rowNum > 0) { // Decrypt only data rows
                    fields[2] = decrypt(fields[2]); // Decrypt Salary
                    fields[3] = decrypt(fields[3]); // Decrypt Email
                }
                decryptedData.add(fields);
                rowNum++;
            }
        }


        // Save decrypted data to a new CSV file
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(outputFile))) {
            for (String[] row : decryptedData) {
                writer.write(String.join(",", row));
                writer.newLine();
            }
        }
        System.out.println("Decrypted CSV saved: " + outputFile);
    }
}
