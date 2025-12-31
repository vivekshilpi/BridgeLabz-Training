package MultilevelInheritance.OnlineRetailOrderManagement;

// ShippedOrder subclass inheriting properties of Order superclass
public class ShippedOrder extends Order {
    private String trackingNumber;

    // Constructor
    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    // Override the getOrderStatus method from Order superclass
    @Override
    public String getOrderStatus() {
        return "Order Shipped";
    }
}
