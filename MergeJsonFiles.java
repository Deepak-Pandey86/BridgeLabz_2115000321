import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.File;
import java.io.IOException;


public class MergeJsonFiles {
    public static void main(String[] args) {
        try {
            // Initialize ObjectMapper
            ObjectMapper objectMapper = new ObjectMapper();


            // Read JSON files
            JsonNode json1 = objectMapper.readTree(new File("student1.json"));
            JsonNode json2 = objectMapper.readTree(new File("student2.json"));


            // Create a merged JSON object
            ObjectNode mergedJson = objectMapper.createObjectNode();
            mergedJson.set("Student1", json1);
            mergedJson.set("Student2", json2);


            // Convert merged JSON to a string and print
            String mergedJsonString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(mergedJson);
            System.out.println("Merged JSON:\n" + mergedJsonString);


            // Write merged JSON to a file
            objectMapper.writeValue(new File("merged.json"), mergedJson);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
