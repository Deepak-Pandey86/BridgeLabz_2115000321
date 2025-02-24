import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


// Interface
interface Greeting {
    void sayHello(String name);
}


// Real implementation
class GreetingImpl implements Greeting {
    public void sayHello(String name) {
        System.out.println("Hello, " + name + "!");
    }
}


// Logging Proxy Handler
class LoggingHandler implements InvocationHandler {
    private final Object target;


    public LoggingHandler(Object target) {
        this.target = target;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Logging: Method called - " + method.getName());
        return method.invoke(target, args); // Execute the original method
    }
}


// Proxy Factory
class ProxyFactory {
    public static <T> T createProxy(T target, Class<T> interfaceType) {
        return (T) Proxy.newProxyInstance(
                interfaceType.getClassLoader(),
                new Class<?>[]{interfaceType},
                new LoggingHandler(target)
        );
    }
}


// Main class
public class LoggingProxyExample {
    public static void main(String[] args) {
        Greeting greeting = new GreetingImpl(); // Real object
        Greeting proxy = ProxyFactory.createProxy(greeting, Greeting.class); // Create proxy


        proxy.sayHello("Alice"); // Calling the method through the proxy
    }
}
