import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.SpecVersion;
import com.networknt.schema.ValidationMessage;
import java.io.File;
import java.io.IOException;
import java.util.Set;


public class JsonEmailValidator {
    public static void main(String[] args) {
        try {
            // Initialize ObjectMapper
            ObjectMapper objectMapper = new ObjectMapper();


            // Read JSON file
            JsonNode jsonData = objectMapper.readTree(new File("users.json"));


            // Load JSON Schema
            JsonSchemaFactory schemaFactory = JsonSchemaFactory.getInstance(SpecVersion.VersionFlag.V7);
            JsonSchema schema = schemaFactory.getSchema(new File("schema.json"));


            // Validate JSON against the schema
            Set<ValidationMessage> errors = schema.validate(jsonData);


            // Check for validation errors
            if (errors.isEmpty()) {
                System.out.println("✅ JSON is valid!");
            } else {
                System.out.println("❌ JSON validation failed:");
                errors.forEach(error -> System.out.println(error.getMessage()));
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
