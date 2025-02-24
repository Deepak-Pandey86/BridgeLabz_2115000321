import java.lang.annotation.*;
import java.lang.reflect.Method;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface ImportantMethod {
    String level() default "HIGH";
}


class Service {
    @ImportantMethod(level = "HIGH")
    public void criticalTask() {
        System.out.println("Executing critical task...");
    }


    @ImportantMethod(level = "MEDIUM")
    public void importantTask() {
        System.out.println("Executing important task...");
    }


    public void regularTask() {
        System.out.println("Executing regular task...");
    }
}


public class ImportantMethodExample {
    public static void main(String[] args) {
        Method[] methods = Service.class.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
                System.out.println("Important Method: " + method.getName() + " | Level: " + annotation.level());
            }
        }
    }
}
