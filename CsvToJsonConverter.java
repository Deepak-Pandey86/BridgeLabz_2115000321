import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;


public class CsvToJsonConverter {
    public static void main(String[] args) {
        try {
            // Initialize CsvMapper
            CsvMapper csvMapper = new CsvMapper();
            CsvSchema csvSchema = CsvSchema.emptySchema().withHeader();


            // Read CSV into List of Maps
            MappingIterator<Map<String, String>> iterator = csvMapper.readerFor(Map.class)
                    .with(csvSchema)
                    .readValues(new File("students.csv"));


            List<Map<String, String>> data = iterator.readAll();


            // Convert List of Maps to JSON using ObjectMapper
            ObjectMapper jsonMapper = new ObjectMapper();
            String json = jsonMapper.writerWithDefaultPrettyPrinter().writeValueAsString(data);


            // Print JSON output
            System.out.println("Converted JSON:\n" + json);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
ID,Name,Age,Marks
101,Alice,22,85
102,Bob,24,78
103,Charlie,21,92

