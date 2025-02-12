class LibraryManagementSystem {
    String title, author, genre;
    int bookID;
    boolean isAvailable;
    Book next, prev;

    public Book(int bookID, String title, String author, String genre, boolean isAvailable) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isAvailable = isAvailable;
        this.next = this.prev = null;
    }
}

class Library {
    private Book head, tail;
    private int count = 0;

    public void addBook(int bookID, String title, String author, String genre, boolean isAvailable, int position) {
        Book newBook = new Book(bookID, title, author, genre, isAvailable);
        if (head == null) {
            head = tail = newBook;
        } else if (position <= 0) {
            newBook.next = head;
            head.prev = newBook;
            head = newBook;
        } else {
            Book temp = head;
            int index = 0;
            while (temp.next != null && index < position - 1) {
                temp = temp.next;
                index++;
            }
            newBook.next = temp.next;
            if (temp.next != null) temp.next.prev = newBook;
            temp.next = newBook;
            newBook.prev = temp;
            if (newBook.next == null) tail = newBook;
        }
        count++;
    }

    public void removeBook(int bookID) {
        Book temp = head;
        while (temp != null && temp.bookID != bookID) {
            temp = temp.next;
        }
        if (temp == null) return;
        if (temp == head) head = temp.next;
        if (temp == tail) tail = temp.prev;
        if (temp.prev != null) temp.prev.next = temp.next;
        if (temp.next != null) temp.next.prev = temp.prev;
        count--;
    }

    public void searchBook(String key) {
        Book temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(key) || temp.author.equalsIgnoreCase(key)) {
                System.out.println("Found: " + temp.title + " by " + temp.author);
            }
            temp = temp.next;
        }
    }

    public void updateAvailability(int bookID, boolean status) {
        Book temp = head;
        while (temp != null) {
            if (temp.bookID == bookID) {
                temp.isAvailable = status;
                return;
            }
            temp = temp.next;
        }
    }

    public void displayBooksForward() {
        Book temp = head;
        while (temp != null) {
            System.out.println(temp.title + " by " + temp.author + " - " + (temp.isAvailable ? "Available" : "Checked Out"));
            temp = temp.next;
        }
    }

    public void displayBooksReverse() {
        Book temp = tail;
        while (temp != null) {
            System.out.println(temp.title + " by " + temp.author + " - " + (temp.isAvailable ? "Available" : "Checked Out"));
            temp = temp.prev;
        }
    }

    public int countBooks() {
        return count;
    }

    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(1, "Book A", "Author X", "Fiction", true, 0);
        library.addBook(2, "Book B", "Author Y", "Non-Fiction", true, 1);
        library.addBook(3, "Book C", "Author Z", "Sci-Fi", false, 2);
        library.displayBooksForward();
        library.removeBook(2);
        library.updateAvailability(1, false);
        System.out.println("Total Books: " + library.countBooks());
        library.displayBooksReverse();
    }
}
