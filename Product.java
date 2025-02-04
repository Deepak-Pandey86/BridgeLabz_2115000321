class Product {
    private static double discount = 10.0;
    private String productName;
    private final int productID;
    private double price;
    private int quantity;

    public Product(String productName, int productID, double price, int quantity) {
        this.productName = productName;
        this.productID = productID;
        this.price = price;
        this.quantity = quantity;
    }

    public void displayProductDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: $" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
        }
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Updated Discount: " + discount + "%");
    }

    public static void main(String[] args) {
        Product prod1 = new Product("Laptop", 101, 1200.0, 2);
        Product prod2 = new Product("Smartphone", 102, 800.0, 1);

        prod1.displayProductDetails();
        prod2.displayProductDetails();

        Product.updateDiscount(15.0);
        prod1.displayProductDetails();
        prod2.displayProductDetails();
    }
}
