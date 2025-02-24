import java.lang.annotation.*;
import java.lang.reflect.Method;


// Define the @RoleAllowed annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface RoleAllowed {
    String value();
}


// User class to represent different roles
class User {
    private String role;


    public User(String role) {
        this.role = role;
    }


    public String getRole() {
        return role;
    }
}


// SecureService class with restricted methods
class SecureService {
    @RoleAllowed("ADMIN")
    public void adminTask() {
        System.out.println("Admin task executed successfully.");
    }


    public void generalTask() {
        System.out.println("General task executed.");
    }
}


// Access control logic
public class RoleBasedAccessControl {
    public static void main(String[] args) throws Exception {
        User adminUser = new User("ADMIN");
        User normalUser = new User("USER");


        SecureService service = new SecureService();


        executeMethod(service, "adminTask", adminUser);  // Should allow
        executeMethod(service, "adminTask", normalUser); // Should deny
        executeMethod(service, "generalTask", normalUser); // Allowed for all
    }


    private static void executeMethod(Object obj, String methodName, User user) throws Exception {
        Method method = obj.getClass().getMethod(methodName);
        if (method.isAnnotationPresent(RoleAllowed.class)) {
            String requiredRole = method.getAnnotation(RoleAllowed.class).value();
            if (!user.getRole().equals(requiredRole)) {
                System.out.println("Access Denied! User role: " + user.getRole());
                return;
            }
        }
        method.invoke(obj);
    }
}
