import java.lang.annotation.*;
import java.lang.reflect.Method;


// Define the custom annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface LogExecutionTime {}


// Utility class to measure execution time
class MethodExecutor {
    public static void executeWithLogging(Object obj, String methodName) throws Exception {
        Method method = obj.getClass().getMethod(methodName);
        if (method.isAnnotationPresent(LogExecutionTime.class)) {
            long startTime = System.nanoTime();
            method.invoke(obj);
            long endTime = System.nanoTime();
            System.out.println(methodName + " executed in " + (endTime - startTime) + " nanoseconds");
        } else {
            method.invoke(obj);
        }
    }
}


// Class with methods annotated with @LogExecutionTime
class TaskProcessor {
    @LogExecutionTime
    public void fastTask() {
        for (int i = 0; i < 1000; i++); // Simulating a quick task
    }


    @LogExecutionTime
    public void slowTask() {
        for (int i = 0; i < 1000000; i++); // Simulating a slower task
    }
}


// Main class to execute methods with logging
public class LogExecutionExample {
    public static void main(String[] args) throws Exception {
        TaskProcessor processor = new TaskProcessor();


        MethodExecutor.executeWithLogging(processor, "fastTask");
        MethodExecutor.executeWithLogging(processor, "slowTask");
    }
}
