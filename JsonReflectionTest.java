import java.lang.reflect.Field;


class JsonConverter {
    public static String toJson(Object obj) {
        StringBuilder json = new StringBuilder("{");


        Field[] fields = obj.getClass().getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            fields[i].setAccessible(true); // Allow access to private fields
            try {
                json.append("\"").append(fields[i].getName()).append("\": ");
                Object value = fields[i].get(obj);
                if (value instanceof String) {
                    json.append("\"").append(value).append("\"");
                } else {
                    json.append(value);
                }
                if (i < fields.length - 1) {
                    json.append(", ");
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Failed to access field", e);
            }
        }


        json.append("}");
        return json.toString();
    }
}


// Sample class to test JSON conversion
class User {
    private String name;
    private int age;
    private boolean active;


    public User(String name, int age, boolean active) {
        this.name = name;
        this.age = age;
        this.active = active;
    }
}


public class JsonReflectionTest {
    public static void main(String[] args) {
        // Create a sample object
        User user = new User("Alice", 25, true);


        // Convert to JSON
        String json = JsonConverter.toJson(user);


        // Print JSON representation
        System.out.println(json);
    }
}
