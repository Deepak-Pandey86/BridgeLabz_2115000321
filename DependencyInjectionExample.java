import java.lang.annotation.*;
import java.lang.reflect.Field;


// Step 1: Create @Inject Annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface Inject {}


// Step 2: Define Dependencies (Services)
class DatabaseService {
    public void connect() {
        System.out.println("Connected to the database.");
    }
}


// Step 3: Define a Class That Requires Dependency Injection
class UserService {
    @Inject
    private DatabaseService databaseService;


    public void performAction() {
        databaseService.connect();
        System.out.println("User action performed.");
    }
}


// Step 4: Implement DI Container
class DIContainer {
    public static void injectDependencies(Object object) {
        Class<?> clazz = object.getClass();
        for (Field field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(Inject.class)) {
                try {
                    field.setAccessible(true);
                    Object dependency = field.getType().newInstance(); // Create instance dynamically
                    field.set(object, dependency);
                } catch (Exception e) {
                    throw new RuntimeException("Failed to inject dependency: " + field.getName(), e);
                }
            }
        }
    }
}


// Step 5: Demonstrate Dependency Injection
public class DependencyInjectionExample {
    public static void main(String[] args) {
        UserService userService = new UserService();
        DIContainer.injectDependencies(userService); // Inject dependencies dynamically
        userService.performAction(); // Use the injected service
    }
}
