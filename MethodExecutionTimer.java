import java.lang.reflect.Method;


class TestMethods {
    public void fastMethod() {
        for (int i = 0; i < 1000; i++); // Simulate some work
    }


    public void slowMethod() {
        try {
            Thread.sleep(500); // Simulate a slower method
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


public class MethodExecutionTimer {
    public static void measureExecutionTime(Object obj, String methodName) {
        try {
            Method method = obj.getClass().getMethod(methodName);
            long startTime = System.nanoTime();
            method.invoke(obj);  // Invoke the method dynamically
            long endTime = System.nanoTime();
            System.out.println(methodName + " executed in " + (endTime - startTime) / 1_000_000.0 + " ms");
        } catch (Exception e) {
            System.out.println("Error executing method: " + methodName);
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        TestMethods test = new TestMethods();
        measureExecutionTime(test, "fastMethod");
        measureExecutionTime(test, "slowMethod");
    }
}






