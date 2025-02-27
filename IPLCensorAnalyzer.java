import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.opencsv.*;
import java.io.*;
import java.util.*;


public class IPLCensorAnalyzer {
    public static void main(String[] args) throws Exception {
        processJSON("ipl_data.json", "ipl_censored.json");
        processCSV("ipl_data.csv", "ipl_censored.csv");
    }


    private static void processJSON(String inputFile, String outputFile) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode root = objectMapper.readTree(new File(inputFile));
        
        for (JsonNode match : root) {
            ((ObjectNode) match).put("team1", censorTeamName(match.get("team1").asText()));
            ((ObjectNode) match).put("team2", censorTeamName(match.get("team2").asText()));
            ((ObjectNode) match).put("player_of_match", "REDACTED");
        }
        
        objectMapper.writeValue(new File(outputFile), root);
    }


    private static void processCSV(String inputFile, String outputFile) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             CSVReader csvReader = new CSVReader(reader);
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
             CSVWriter csvWriter = new CSVWriter(writer)) {
            
            List<String[]> allRows = csvReader.readAll();
            
            if (!allRows.isEmpty()) {
                String[] headers = allRows.get(0);
                csvWriter.writeNext(headers);
                
                for (int i = 1; i < allRows.size(); i++) {
                    String[] row = allRows.get(i);
                    row[1] = censorTeamName(row[1]);  // Team1
                    row[2] = censorTeamName(row[2]);  // Team2
                    row[4] = "REDACTED"; // Player of the Match
                    csvWriter.writeNext(row);
                }
            }
        }
    }
    
    private static String censorTeamName(String teamName) {
        String[] words = teamName.split(" ");
        return words.length > 1 ? words[0] + " ***" : teamName;
    }
}
