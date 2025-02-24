import java.lang.annotation.*;
import java.lang.reflect.AnnotatedElement;


// Define the @Author annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Author {
    String name();
}


// Apply the annotation to a class
@Author(name = "John Doe")
class Book {
    public void display() {
        System.out.println("Book class method executed.");
    }
}


public class RetrieveAnnotation {
    public static void main(String[] args) {
        try {
            // Get the class reference
            Class<Book> obj = Book.class;


            // Check if @Author annotation is present
            if (obj.isAnnotationPresent(Author.class)) {
                // Retrieve the annotation
                Author author = obj.getAnnotation(Author.class);
                System.out.println("Author: " + author.name());
            } else {
                System.out.println("No Author annotation found.");
            }
        } catch (Exception e) {
            System.out.println("Error retrieving annotation: " + e.getMessage());
        }
    }
}
