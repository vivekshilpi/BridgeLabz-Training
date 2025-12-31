package MultilevelInheritance.OnlineRetailOrderManagement;

// DeliveredOrder subclass inheriting properties of ShippedOrder superclass
public class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;

    // Constructor
    public DeliveredOrder(String orderId, String orderDate,
                          String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    // Override the getOrderStatus method from ShippedOrder superclass
    @Override
    public String getOrderStatus() {
        return "Order Delivered";
    }
}
