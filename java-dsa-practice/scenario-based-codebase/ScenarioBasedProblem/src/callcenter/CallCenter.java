package callcenter;

import java.util.*;

public class CallCenter {

    // Normal customer queue (FIFO)
    private Queue<Customer> normalQueue = new LinkedList<>();

    // VIP queue (higher priority)
    private PriorityQueue<Customer> vipQueue =
            new PriorityQueue<>((a, b) -> a.name.compareTo(b.name));

    // Customer call count tracking
    private HashMap<String, Integer> callCountMap = new HashMap<>();

    // Incoming call
    public void receiveCall(Customer customer) {

        // Track number of calls per customer
        callCountMap.put(
            customer.id,
            callCountMap.getOrDefault(customer.id, 0) + 1
        );

        // Add to appropriate queue
        if (customer.isVIP) {
            vipQueue.add(customer);
            System.out.println("VIP Call added: " + customer);
        } else {
            normalQueue.add(customer);
            System.out.println("Normal Call added: " + customer);
        }
    }

    // Handle next call
    public void handleCall() {
        Customer nextCustomer;

        if (!vipQueue.isEmpty()) {
            nextCustomer = vipQueue.poll();
            System.out.println("Handling VIP customer: " + nextCustomer);
        } else if (!normalQueue.isEmpty()) {
            nextCustomer = normalQueue.poll();
            System.out.println("Handling normal customer: " + nextCustomer);
        } else {
            System.out.println("No calls in queue");
            return;
        }
    }

    // Display call count
    public void displayCallStats() {
        System.out.println("\nCustomer Call Count:");
        for (String id : callCountMap.keySet()) {
            System.out.println("Customer ID " + id +
                               " → " + callCountMap.get(id) + " calls");
        }
    }
}
