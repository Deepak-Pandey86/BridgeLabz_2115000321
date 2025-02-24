import java.lang.reflect.Field;


class Configuration {
    private static String API_KEY = "DEFAULT_KEY";


    public static String getApiKey() {
        return API_KEY;
    }
}


public class ModifyStaticField {
    public static void main(String[] args) {
        try {
            // Get the Configuration class
            Class<Configuration> configClass = Configuration.class;


            // Access the private static field "API_KEY"
            Field apiKeyField = configClass.getDeclaredField("API_KEY");


            // Make the field accessible
            apiKeyField.setAccessible(true);


            // Modify the static field's value
            apiKeyField.set(null, "NEW_SECRET_KEY");


            // Print the updated value
            System.out.println("Updated API Key: " + Configuration.getApiKey());


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
