// Superclass: Book
class LibraryManagementWithBooksAndAuthors {
    protected String title;
    protected int publicationYear;

    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public void displayInfo() {
        System.out.println("Book: " + title);
        System.out.println("Published Year: " + publicationYear);
    }
}

// Subclass: Author (Inherits from Book)
class Author extends Book {
    private String name;
    private String bio;

    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author: " + name);
        System.out.println("Bio: " + bio);
    }
}

// Main class to test the inheritance
public class LibraryManagement {
    public static void main(String[] args) {
        Author author = new Author("The Great Novel", 2020, "John Doe", "A famous novelist.");
        author.displayInfo();
    }
}
