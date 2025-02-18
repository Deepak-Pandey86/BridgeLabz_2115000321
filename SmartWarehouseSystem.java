// Abstract class representing a warehouse item
abstract class WarehouseItem {
    private String name;
    private double price;
    
    public WarehouseItem(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
    
    @Override
    public String toString() {
        return "Item: " + name + ", Price: " + price;
    }
}

// Specific warehouse item types
class Electronics extends WarehouseItem {
    public Electronics(String name, double price) {
        super(name, price);
    }
}

class Groceries extends WarehouseItem {
    public Groceries(String name, double price) {
        super(name, price);
    }
}

class Furniture extends WarehouseItem {
    public Furniture(String name, double price) {
        super(name, price);
    }
}

// Generic storage class
import java.util.ArrayList;
import java.util.List;

class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();
    
    public void addItem(T item) {
        items.add(item);
    }
    
    public T getItem(int index) {
        if (index >= 0 && index < items.size()) {
            return items.get(index);
        }
        return null;
    }
    
    public List<T> getAllItems() {
        return items;
    }
}

// Method using wildcard to display all items
class Warehouse {
    public static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println(item);
        }
    }
}

public class SmartWarehouseSystem {
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop", 1200.00));
        electronicsStorage.addItem(new Electronics("Smartphone", 800.00));
        
        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Apples", 5.00));
        groceriesStorage.addItem(new Groceries("Milk", 3.50));
        
        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair", 150.00));
        furnitureStorage.addItem(new Furniture("Table", 300.00));
        
        System.out.println("Electronics:");
        Warehouse.displayItems(electronicsStorage.getAllItems());
        
        System.out.println("\nGroceries:");
        Warehouse.displayItems(groceriesStorage.getAllItems());
        
        System.out.println("\nFurniture:");
        Warehouse.displayItems(furnitureStorage.getAllItems());
    }
}
