import java.lang.annotation.*;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;


// Define @CacheResult annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface CacheResult {}


// Cache storage
class Cache {
    private static final Map<String, Object> cache = new HashMap<>();


    public static boolean contains(String key) {
        return cache.containsKey(key);
    }


    public static Object get(String key) {
        return cache.get(key);
    }


    public static void put(String key, Object value) {
        cache.put(key, value);
    }
}


// Expensive computation class
class ExpensiveOperations {
    @CacheResult
    public int fibonacci(int n) {
        if (n <= 1) return n;


        String key = "fibonacci_" + n;
        if (Cache.contains(key)) {
            System.out.println("Fetching from cache: " + n);
            return (int) Cache.get(key);
        }


        int result = fibonacci(n - 1) + fibonacci(n - 2);
        Cache.put(key, result);
        return result;
    }
}


// Main class to test caching
public class CustomCacheSystem {
    public static void main(String[] args) {
        ExpensiveOperations operations = new ExpensiveOperations();


        System.out.println("Fibonacci(10): " + operations.fibonacci(10));
        System.out.println("Fibonacci(10) Again: " + operations.fibonacci(10)); // Cached result
        System.out.println("Fibonacci(8): " + operations.fibonacci(8)); // Cached result
    }
}
