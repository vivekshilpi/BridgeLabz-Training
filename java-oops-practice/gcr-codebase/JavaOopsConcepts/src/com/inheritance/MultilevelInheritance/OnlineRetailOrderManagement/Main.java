package MultilevelInheritance.OnlineRetailOrderManagement;

public class Main {
    public static void main(String[] args) {
        // Create object
        DeliveredOrder deliveredOrder = new DeliveredOrder(
                "ORD123",
                "2024-01-20",
                "TRACK456",
                "2024-01-25");

        // Call the method from the DeliveredOrder class
        System.out.println("Order Status: " + deliveredOrder.getOrderStatus());

        System.out.println("\n-------------------\n");
    }
}
