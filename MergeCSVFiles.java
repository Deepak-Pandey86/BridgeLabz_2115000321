import java.io.*;
import java.util.*;


public class MergeCSVFiles {
    public static void main(String[] args) {
        String file1 = "students1.csv";
        String file2 = "students2.csv";
        String outputFile = "merged_students.csv";
        
        Map<String, String[]> studentData = new HashMap<>();


        // Read first CSV (ID, Name, Age)
        try (BufferedReader br = new BufferedReader(new FileReader(file1))) {
            String line;
            boolean isHeader = true;


            while ((line = br.readLine()) != null) {
                if (isHeader) { 
                    isHeader = false; // Skip header
                    continue;
                }


                String[] fields = line.split(",");
                if (fields.length != 3) continue;


                String id = fields[0].trim();
                studentData.put(id, new String[]{fields[1].trim(), fields[2].trim(), "", ""});
            }
        } catch (IOException e) {
            System.out.println("Error reading " + file1 + ": " + e.getMessage());
        }


        // Read second CSV (ID, Marks, Grade)
        try (BufferedReader br = new BufferedReader(new FileReader(file2))) {
            String line;
            boolean isHeader = true;


            while ((line = br.readLine()) != null) {
                if (isHeader) { 
                    isHeader = false; // Skip header
                    continue;
                }


                String[] fields = line.split(",");
                if (fields.length != 3) continue;


                String id = fields[0].trim();
                if (studentData.containsKey(id)) {
                    studentData.get(id)[2] = fields[1].trim(); // Marks
                    studentData.get(id)[3] = fields[2].trim(); // Grade
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading " + file2 + ": " + e.getMessage());
        }


        // Write merged data to new CSV
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {
            bw.write("ID,Name,Age,Marks,Grade\n");


            for (Map.Entry<String, String[]> entry : studentData.entrySet()) {
                String id = entry.getKey();
                String[] details = entry.getValue();
                bw.write(id + "," + details[0] + "," + details[1] + "," + details[2] + "," + details[3] + "\n");
            }


            System.out.println("Merged CSV created: " + outputFile);
        } catch (IOException e) {
            System.out.println("Error writing merged file: " + e.getMessage());
        }
    }
}
