import java.lang.reflect.Field;
import java.util.Map;


class ObjectMapper {
    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) {
        try {
            // Create a new instance of the class
            T obj = clazz.getDeclaredConstructor().newInstance();


            // Iterate through the properties map
            for (Map.Entry<String, Object> entry : properties.entrySet()) {
                try {
                    // Get the field by name
                    Field field = clazz.getDeclaredField(entry.getKey());


                    // Make it accessible (if private)
                    field.setAccessible(true);


                    // Set the field value
                    field.set(obj, entry.getValue());
                } catch (NoSuchFieldException e) {
                    // Ignore missing fields
                }
            }
            return obj;
        } catch (Exception e) {
            throw new RuntimeException("Failed to map object", e);
        }
    }
}


// Sample class to test object mapping
class User {
    private String name;
    private int age;


    @Override
    public String toString() {
        return "User{name='" + name + "', age=" + age + "}";
    }
}


public class CustomObjectMapperTest {
    public static void main(String[] args) {
        // Sample property map
        Map<String, Object> userProperties = Map.of(
            "name", "Alice",
            "age", 25
        );


        // Convert map to User object
        User user = ObjectMapper.toObject(User.class, userProperties);


        // Print the populated object
        System.out.println(user);
    }
}
