class MovieManagementSystem {
    String title;
    String director;
    int year;
    double rating;
    Movie next, prev;

    public Movie(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.next = null;
        this.prev = null;
    }
}

class MovieManagement {
    private Movie head, tail;

    public void addMovieAtEnd(String title, String director, int year, double rating) {
        Movie newMovie = new Movie(title, director, year, rating);
        if (head == null) {
            head = tail = newMovie;
        } else {
            tail.next = newMovie;
            newMovie.prev = tail;
            tail = newMovie;
        }
    }

    public void addMovieAtBeginning(String title, String director, int year, double rating) {
        Movie newMovie = new Movie(title, director, year, rating);
        if (head == null) {
            head = tail = newMovie;
        } else {
            newMovie.next = head;
            head.prev = newMovie;
            head = newMovie;
        }
    }

    public void removeMovieByTitle(String title) {
        Movie current = head;
        while (current != null) {
            if (current.title.equalsIgnoreCase(title)) {
                if (current == head) {
                    head = current.next;
                    if (head != null) head.prev = null;
                } else if (current == tail) {
                    tail = current.prev;
                    if (tail != null) tail.next = null;
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                return;
            }
            current = current.next;
        }
    }

    public void searchMovieByDirector(String director) {
        Movie current = head;
        while (current != null) {
            if (current.director.equalsIgnoreCase(director)) {
                System.out.println("Found: " + current.title);
            }
            current = current.next;
        }
    }

    public void searchMovieByRating(double rating) {
        Movie current = head;
        while (current != null) {
            if (current.rating == rating) {
                System.out.println("Found: " + current.title);
            }
            current = current.next;
        }
    }

    public void updateMovieRating(String title, double newRating) {
        Movie current = head;
        while (current != null) {
            if (current.title.equalsIgnoreCase(title)) {
                current.rating = newRating;
                return;
            }
            current = current.next;
        }
    }

    public void displayMoviesForward() {
        Movie current = head;
        while (current != null) {
            System.out.println(current.title + " | " + current.director + " | " + current.year + " | " + current.rating);
            current = current.next;
        }
    }

    public void displayMoviesReverse() {
        Movie current = tail;
        while (current != null) {
            System.out.println(current.title + " | " + current.director + " | " + current.year + " | " + current.rating);
            current = current.prev;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MovieManagement mm = new MovieManagement();
        mm.addMovieAtEnd("Inception", "Christopher Nolan", 2010, 8.8);
        mm.addMovieAtBeginning("Titanic", "James Cameron", 1997, 7.8);
        mm.addMovieAtEnd("Interstellar", "Christopher Nolan", 2014, 8.6);

        System.out.println("Movies in forward order:");
        mm.displayMoviesForward();

        System.out.println("Movies in reverse order:");
        mm.displayMoviesReverse();
    }
}
