package bookbazaar;

import java.util.HashMap;
import java.util.Map;

public class Order {

    private String userName;
    private Map<Book, Integer> items = new HashMap<>();
    private OrderStatus status;

    public Order(String userName) {
        this.userName = userName;
        this.status = OrderStatus.CREATED;
    }

    public void addBook(Book book, int quantity) {
        if (book.reduceStock(quantity)) {
            items.put(book, quantity);
        } else {
            System.out.println("Insufficient stock for: " + book.getTitle());
        }
    }

    public double calculateOrderTotal() {
        double total = 0;
        for (Map.Entry<Book, Integer> entry : items.entrySet()) {
            total += entry.getKey().calculateTotalCost(entry.getValue());
        }
        return total;
    }

    protected void updateStatus(OrderStatus status) {
        this.status = status;
    }

    public OrderStatus getStatus() {
        return status;
    }
}

