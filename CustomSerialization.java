import java.lang.annotation.*;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;


// Define the @JsonField annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface JsonField {
    String name();
}


// User class with annotated fields
class User {
    @JsonField(name = "user_name")
    private String username;


    @JsonField(name = "user_email")
    private String email;


    private int age; // Not annotated, so it won't be serialized


    public User(String username, String email, int age) {
        this.username = username;
        this.email = email;
        this.age = age;
    }
}


// JSON serializer class
class JsonSerializer {
    public static String serialize(Object obj) throws IllegalAccessException {
        Class<?> clazz = obj.getClass();
        Map<String, String> jsonMap = new HashMap<>();


        for (Field field : clazz.getDeclaredFields()) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(JsonField.class)) {
                String key = field.getAnnotation(JsonField.class).name();
                String value = field.get(obj).toString();
                jsonMap.put(key, value);
            }
        }


        return jsonMap.toString().replace("=", ":"); // Convert map to JSON-like format
    }
}


// Main class to test serialization
public class CustomSerialization {
    public static void main(String[] args) throws IllegalAccessException {
        User user = new User("Alice", "alice@example.com", 25);
        String jsonString = JsonSerializer.serialize(user);
        System.out.println(jsonString);
    }
}
