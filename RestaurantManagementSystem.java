// Superclass: Person
class RestaurantManagementSystem
 {
    protected String name;
    protected int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}

// Interface: Worker (for hybrid inheritance simulation)
interface Worker {
    void performDuties();
}

// Subclass: Chef (inherits from Person, implements Worker)
class Chef extends Person implements Worker {
    public Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is preparing meals in the kitchen.");
    }
}

// Subclass: Waiter (inherits from Person, implements Worker)
class Waiter extends Person implements Worker {
    public Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is serving food to customers.");
    }
}

// Main class to test the system
public class RestaurantManagement {
    public static void main(String[] args) {
        Chef chef = new Chef("John", 101);
        Waiter waiter = new Waiter("Alice", 202);

        chef.displayInfo();
        chef.performDuties();

        waiter.displayInfo();
        waiter.performDuties();
    }
}
