import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;


public class JsonValidator {
    public static void main(String[] args) {
        String jsonString = "{ \"name\": \"John Doe\", \"age\": 25, \"email\": \"john.doe@example.com\" }";


        if (isValidJson(jsonString)) {
            System.out.println("✅ JSON is valid!");
        } else {
            System.out.println("❌ JSON is invalid!");
        }
    }


    public static boolean isValidJson(String jsonString) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(jsonString);


            // Check required fields
            if (!jsonNode.has("name") || !jsonNode.has("age") || !jsonNode.has("email")) {
                System.out.println("❌ Missing required fields!");
                return false;
            }


            // Validate data types
            if (!jsonNode.get("name").isTextual() || !jsonNode.get("age").isInt() || !jsonNode.get("email").isTextual()) {
                System.out.println("❌ Invalid data types!");
                return false;
            }


            return true;
        } catch (IOException e) {
            System.out.println("❌ Invalid JSON format!");
            return false;
        }
    }
}
