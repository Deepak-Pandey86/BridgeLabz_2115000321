class Book1 {
    private String title;
    private String author;
    private double price;
    private boolean available;

    public Book(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    public boolean borrowBook() {
        if (available) {
            available = false;
            return true;
        }
        return false;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Available: " + (available ? "Yes" : "No"));
    }

    public static void main(String[] args) {
        Book book1 = new Book("The Alchemist", "Paulo Coelho", 10.99, true);
        System.out.println("Before Borrowing:");
        book1.displayDetails();

        if (book1.borrowBook()) {
            System.out.println("\nBook borrowed successfully.");
        } else {
            System.out.println("\nBook is not available.");
        }

        System.out.println("\nAfter Borrowing:");
        book1.displayDetails();
    }
}
