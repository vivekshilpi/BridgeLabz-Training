package MultilevelInheritance.OnlineRetailOrderManagement;

public class Order {
    private String orderId;
    private String orderDate;

    // Constructor
    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Make a method to get order status
    public String getOrderStatus() {
        return "Order Placed";
    }
}
