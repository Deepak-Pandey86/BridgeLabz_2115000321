import java.lang.reflect.Method;
import java.util.Scanner;


class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }


    public int subtract(int a, int b) {
        return a - b;
    }


    public int multiply(int a, int b) {
        return a * b;
    }
}


public class import java.lang.reflect.Method;
import java.util.Scanner;


class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }


    public int subtract(int a, int b) {
        return a - b;
    }


    public int multiply(int a, int b) {
        return a * b;
    }
}


public class DynamicMethodInvocation {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            MathOperations mathOps = new MathOperations();


            // Get method name from user
            System.out.print("Enter method name (add, subtract, multiply): ");
            String methodName = scanner.next();


            // Get parameters from user
            System.out.print("Enter two numbers: ");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();


            // Get method reference using Reflection
            Method method = MathOperations.class.getMethod(methodName, int.class, int.class);


            // Invoke the method dynamically
            Object result = method.invoke(mathOps, num1, num2);


            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Invalid method name or input! " + e.getMessage());
        }
    }
}
 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            MathOperations mathOps = new MathOperations();


            // Get method name from user
            System.out.print("Enter method name (add, subtract, multiply): ");
            String methodName = scanner.next();


            // Get parameters from user
            System.out.print("Enter two numbers: ");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();


            // Get method reference using Reflection
            Method method = MathOperations.class.getMethod(methodName, int.class, int.class);


            // Invoke the method dynamically
            Object result = method.invoke(mathOps, num1, num2);


            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Invalid method name or input! " + e.getMessage());
        }
    }
}
