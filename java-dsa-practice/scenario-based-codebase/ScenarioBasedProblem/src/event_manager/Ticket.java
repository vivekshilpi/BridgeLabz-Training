package event_manager;

class Ticket {
    String eventName;
    double price;

    Ticket(String eventName, double price) {
        this.eventName = eventName;
        this.price = price;
    }

    void display() {
        System.out.println(eventName + " | ₹" + price);
    }
}
