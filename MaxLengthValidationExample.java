import java.lang.annotation.*;
import java.lang.reflect.Field;


// Define the annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface MaxLength {
    int value();
}


// User class with field validation
class User {
    @MaxLength(10)
    private String username;


    public User(String username) throws Exception {
        validateMaxLength(this, "username", username);
        this.username = username;
    }


    private void validateMaxLength(Object obj, String fieldName, String fieldValue) throws Exception {
        Field field = obj.getClass().getDeclaredField(fieldName);
        if (field.isAnnotationPresent(MaxLength.class)) {
            int maxLength = field.getAnnotation(MaxLength.class).value();
            if (fieldValue.length() > maxLength) {
                throw new IllegalArgumentException(fieldName + " exceeds max length of " + maxLength);
            }
        }
    }


    public String getUsername() {
        return username;
    }
}


// Main class to test the annotation
public class MaxLengthValidationExample {
    public static void main(String[] args) {
        try {
            User user1 = new User("JohnDoe"); // Valid
            System.out.println("Valid username: " + user1.getUsername());


            User user2 = new User("LongUsername123"); // Exceeds max length
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
