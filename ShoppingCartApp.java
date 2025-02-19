import java.util.*;

class ShoppingCart {
    private Map<String, Double> productPrices = new HashMap<>(); // Stores product prices
    private Map<String, Integer> cart = new LinkedHashMap<>();  // Maintains order of items added

      void addProduct(String product, double price) {
        productPrices.put(product, price);
    }
    void addToCart(String product, int quantity) {
        if (productPrices.containsKey(product)) {
            cart.put(product, cart.getOrDefault(product, 0) + quantity);
        } else {
            System.out.println("Product not found!");
        }
    }


    void displayCart() {
        System.out.println("\nShopping Cart (Order of Addition):");
        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            System.out.println(entry.getKey() + " - Quantity: " + entry.getValue());
        }
    }
    void displaySortedByPrice() {
        TreeMap<Double, String> sortedProducts = new TreeMap<>();
        for (String product : cart.keySet()) {
            sortedProducts.put(productPrices.get(product), product);
        }

        System.out.println("\nShopping Cart (Sorted by Price):");
        for (Map.Entry<Double, String> entry : sortedProducts.entrySet()) {
            System.out.println(entry.getValue() + " - Price: $" + entry.getKey());
        }
    }
    void calculateTotal() {
        double total = 0;
        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            total += productPrices.get(entry.getKey()) * entry.getValue();
        }
        System.out.println("\nTotal Cost: $" + total);
    }
}

public class ShoppingCartApp {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

     
        cart.addProduct("Laptop", 1200);
        cart.addProduct("Phone", 800);
        cart.addProduct("Headphones", 150);
        cart.addProduct("Mouse", 50);

        cart.addToCart("Laptop", 1);
        cart.addToCart("Phone", 2);
        cart.addToCart("Headphones", 1);
        cart.addToCart("Mouse", 3);

        cart.displayCart();          
        cart.displaySortedByPrice();  
        cart.calculateTotal();    
    }
}

