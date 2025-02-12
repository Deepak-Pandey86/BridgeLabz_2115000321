class Ticket {
    int ticketID;
    String customerName;
    String movieName;
    int seatNumber;
    String bookingTime;
    Ticket next;

    public Ticket(int ticketID, String customerName, String movieName, int seatNumber, String bookingTime) {
        this.ticketID = ticketID;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = null;
    }
}

class TicketReservationSystem {
    private Ticket head = null;
    private Ticket tail = null;
    private int totalTickets = 0;

    public void addTicket(int ticketID, String customerName, String movieName, int seatNumber, String bookingTime) {
        Ticket newTicket = new Ticket(ticketID, customerName, movieName, seatNumber, bookingTime);
        if (head == null) {
            head = newTicket;
            tail = newTicket;
            tail.next = head;
        } else {
            tail.next = newTicket;
            tail = newTicket;
            tail.next = head;
        }
        totalTickets++;
    }

    public void removeTicket(int ticketID) {
        if (head == null) return;
        Ticket current = head, prev = null;
        do {
            if (current.ticketID == ticketID) {
                if (current == head) {
                    head = head.next;
                    tail.next = head;
                } else if (current == tail) {
                    tail = prev;
                    tail.next = head;
                } else {
                    prev.next = current.next;
                }
                totalTickets--;
                return;
            }
            prev = current;
            current = current.next;
        } while (current != head);
    }

    public void displayTickets() {
        if (head == null) return;
        Ticket current = head;
        do {
            System.out.println("Ticket ID: " + current.ticketID + ", Customer: " + current.customerName + ", Movie: " + current.movieName + ", Seat: " + current.seatNumber + ", Time: " + current.bookingTime);
            current = current.next;
        } while (current != head);
    }

    public void searchTicket(String key) {
        if (head == null) return;
        Ticket current = head;
        do {
            if (current.customerName.equalsIgnoreCase(key) || current.movieName.equalsIgnoreCase(key)) {
                System.out.println("Found Ticket - ID: " + current.ticketID + ", Customer: " + current.customerName + ", Movie: " + current.movieName);
            }
            current = current.next;
        } while (current != head);
    }

    public int countTickets() {
        return totalTickets;
    }
}

public class OnlineTicketReservation {
    public static void main(String[] args) {
        TicketReservationSystem system = new TicketReservationSystem();
        system.addTicket(1, "John Doe", "Inception", 12, "10:00 AM");
        system.addTicket(2, "Jane Smith", "Interstellar", 8, "2:00 PM");
        system.displayTickets();
        system.searchTicket("John Doe");
        system.removeTicket(1);
        system.displayTickets();
        System.out.println("Total Tickets: " + system.countTickets());
    }
}
