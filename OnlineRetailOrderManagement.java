// Base class: Order
class OnlineRetailOrderManagement {
    protected int orderId;
    protected String orderDate;

    public Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return "Order placed on " + orderDate;
    }

    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
    }
}

// Subclass: ShippedOrder (Extends Order)
class ShippedOrder extends Order {
    protected String trackingNumber;

    public ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return super.getOrderStatus() + " and shipped with tracking number: " + trackingNumber;
    }
}

// Subclass: DeliveredOrder (Extends ShippedOrder)
class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;

    public DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return super.getOrderStatus() + " and delivered on " + deliveryDate;
    }
}

// Main class to test the inheritance
public class OrderManagement {
    public static void main(String[] args) {
        DeliveredOrder order = new DeliveredOrder(101, "2024-02-01", "TRK12345", "2024-02-05");
        order.displayOrderDetails();
        System.out.println(order.getOrderStatus());
    }
}
