// Base class: Book
class Book {
    public String ISBN;       // Public: Accessible anywhere
    protected String title;   // Protected: Accessible in subclasses
    private String author;    // Private: Encapsulated, accessed via getter/setter

    // Constructor
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }

    // Setter for author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Subclass: EBook (demonstrating protected & public access)
class EBook extends Book {
    private double fileSizeMB;  // Additional attribute for EBook

    // Constructor
    public EBook(String ISBN, String title, String author, double fileSizeMB) {
        super(ISBN, title, author);
        this.fileSizeMB = fileSizeMB;
    }

    // Method to display EBook details
    public void displayEBookDetails() {
        System.out.println("EBook Details:");
        System.out.println("ISBN: " + ISBN);    // Public: Accessible
        System.out.println("Title: " + title);  // Protected: Accessible in subclass
        System.out.println("File Size: " + fileSizeMB + " MB");
        System.out.println("Author: " + getAuthor());  // Accessing private member via getter
    }
}

// Main class
public class BookLibrary {
    public static void main(String[] args) {
        // Creating a Book object
        Book book1 = new Book("978-3-16-148410-0", "Java Programming", "John Doe");
        book1.displayBookDetails();

        // Modifying author using setter
        book1.setAuthor("Jane Doe");
        System.out.println("Updated Author: " + book1.getAuthor());

        System.out.println("\n------------------\n");

        // Creating an EBook object
        EBook ebook1 = new EBook("978-0-12-345678-9", "Python for Beginners", "Alice Smith", 5.5);
        ebook1.displayEBookDetails();
    }
}
