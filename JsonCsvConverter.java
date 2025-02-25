import org.json.JSONArray;
import org.json.JSONObject;
import org.json.CDL;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


public class JsonCsvConverter {
    public static void main(String[] args) {
        String jsonFile = "students.json";
        String csvFile = "students.csv";
        String jsonOutputFile = "converted_students.json";


        jsonToCsv(jsonFile, csvFile);
        csvToJson(csvFile, jsonOutputFile);
    }


    // Convert JSON to CSV
    public static void jsonToCsv(String jsonFile, String csvFile) {
        try {
            String jsonContent = new String(Files.readAllBytes(Paths.get(jsonFile)));
            JSONArray jsonArray = new JSONArray(jsonContent);
            String csvData = CDL.toString(jsonArray);


            Files.write(Paths.get(csvFile), csvData.getBytes());
            System.out.println("JSON converted to CSV: " + csvFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    // Convert CSV to JSON
    public static void csvToJson(String csvFile, String jsonOutputFile) {
        try {
            List<String> lines = Files.readAllLines(Paths.get(csvFile));
            String csvContent = String.join("\n", lines);
            JSONArray jsonArray = CDL.toJSONArray(csvContent);


            Files.write(Paths.get(jsonOutputFile), jsonArray.toString(4).getBytes());
            System.out.println("CSV converted back to JSON: " + jsonOutputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
