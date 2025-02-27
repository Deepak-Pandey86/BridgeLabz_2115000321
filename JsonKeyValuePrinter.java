import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;


public class JsonKeyValuePrinter {
    public static void main(String[] args) {
        try {
            // Initialize Jackson ObjectMapper
            ObjectMapper objectMapper = new ObjectMapper();


            // Read JSON file as JsonNode
            JsonNode rootNode = objectMapper.readTree(new File("data.json"));


            // Print all keys and values recursively
            printJson(rootNode, "");


        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static void printJson(JsonNode node, String parentKey) {
        if (node.isObject()) {
            // Iterate over JSON object keys
            Iterator<Map.Entry<String, JsonNode>> fields = node.fields();
            while (fields.hasNext()) {
                Map.Entry<String, JsonNode> entry = fields.next();
                printJson(entry.getValue(), parentKey + entry.getKey() + ".");
            }
        } else if (node.isArray()) {
            // Iterate over JSON array elements
            for (int i = 0; i < node.size(); i++) {
                printJson(node.get(i), parentKey + "[" + i + "].");
            }
        } else {
            // Print key-value pair for primitive values
            System.out.println(parentKey.substring(0, parentKey.length() - 1) + " = " + node.asText());
        }
    }
}
