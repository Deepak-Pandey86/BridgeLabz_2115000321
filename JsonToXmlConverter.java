import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import java.io.File;
import java.io.IOException;


public class JsonToXmlConverter {
    public static void main(String[] args) {
        try {
            // Initialize ObjectMapper for JSON
            ObjectMapper jsonMapper = new ObjectMapper();
            
            // Read JSON file
            JsonNode jsonNode = jsonMapper.readTree(new File("data.json"));


            // Initialize XmlMapper
            XmlMapper xmlMapper = new XmlMapper();


            // Convert JSON to XML
            String xml = xmlMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonNode);


            // Print XML output
            System.out.println("Converted XML:\n" + xml);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
