package tailor_shop;

class Order {
    int orderId;
    String customerName;
    int deliveryDeadline; // days from today

    Order(int orderId, String customerName, int deliveryDeadline) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.deliveryDeadline = deliveryDeadline;
    }

    void display() {
        System.out.println(
            "Order ID: " + orderId +
            ", Customer: " + customerName +
            ", Deadline: " + deliveryDeadline + " days"
        );
    }
}
