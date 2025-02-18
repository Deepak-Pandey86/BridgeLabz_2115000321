import java.util.ArrayList;
import java.util.List;

// Base category interface
interface Category {
    String getCategoryName();
}

// Specific categories
class BookCategory implements Category {
    @Override
    public String getCategoryName() {
        return "Books";
    }
}

class ClothingCategory implements Category {
    @Override
    public String getCategoryName() {
        return "Clothing";
    }
}

class GadgetCategory implements Category {
    @Override
    public String getCategoryName() {
        return "Gadgets";
    }
}

// Generic Product class with bounded type parameter
class Product<T extends Category> {
    private String name;
    private double price;
    private T category;

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public T getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return name + " (Category: " + category.getCategoryName() + ", Price: $" + price + ")";
    }
}

// Product Catalog
class ProductCatalog {
    private List<Product<? extends Category>> products = new ArrayList<>();

    public void addProduct(Product<? extends Category> product) {
        products.add(product);
    }

    public void showCatalog() {
        for (Product<? extends Category> product : products) {
            System.out.println(product);
        }
    }
}

// Generic method to apply discount
class DiscountManager {
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double newPrice = product.getPrice() - (product.getPrice() * (percentage / 100));
        product.setPrice(newPrice);
        System.out.println("Discount applied! New price of " + product.getName() + " is $" + newPrice);
    }
}

public class Marketplace {
    public static void main(String[] args) {
        Product<BookCategory> book = new Product<>("Java Programming", 50.0, new BookCategory());
        Product<ClothingCategory> shirt = new Product<>("Cotton Shirt", 20.0, new ClothingCategory());
        Product<GadgetCategory> phone = new Product<>("Smartphone", 500.0, new GadgetCategory());

        ProductCatalog catalog = new ProductCatalog();
        catalog.addProduct(book);
        catalog.addProduct(shirt);
        catalog.addProduct(phone);

        System.out.println("Before Discount:");
        catalog.showCatalog();

        DiscountManager.applyDiscount(book, 10);
        DiscountManager.applyDiscount(shirt, 15);
        DiscountManager.applyDiscount(phone, 5);

        System.out.println("\nAfter Discount:");
        catalog.showCatalog();
    }
}
