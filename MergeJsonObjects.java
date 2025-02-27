import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;


public class MergeJsonObjects {
    public static void main(String[] args) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();


            // JSON Strings (can be replaced with reading from files)
            String json1 = "{ \"id\": 101, \"name\": \"John Doe\", \"email\": \"john.doe@example.com\" }";
            String json2 = "{ \"age\": 25, \"city\": \"New York\", \"phone\": \"123-456-7890\" }";


            // Convert Strings to JSON Nodes
            JsonNode node1 = objectMapper.readTree(json1);
            JsonNode node2 = objectMapper.readTree(json2);


            // Merge JSON Objects
            ObjectNode mergedNode = objectMapper.createObjectNode();
            mergedNode.setAll((ObjectNode) node1);
            mergedNode.setAll((ObjectNode) node2);


            // Print Merged JSON
            String mergedJson = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(mergedNode);
            System.out.println("Merged JSON: \n" + mergedJson);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
