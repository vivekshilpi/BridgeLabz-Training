package trafficmanager;

import java.util.LinkedList;
import java.util.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class TrafficManager {

    public Vehicle head;
    public Vehicle tail;

    public Queue<String> waitingQueue;
    public int queueCapacity;

    public TrafficManager(int capacity) {
        this.queueCapacity = capacity;
        this.waitingQueue = new LinkedList<>();
        this.head = null;
        this.tail = null;
    }

    // Add vehicle to waiting queue
    public void addToQueue(String vehicleNumber) {
        if (waitingQueue.size() == queueCapacity) {
            System.out.println("Queue Overflow! Vehicle cannot enter.");
            return;
        }
        waitingQueue.add(vehicleNumber);
        System.out.println("Vehicle added to waiting queue");
    }

    // Move vehicle from queue to roundabout
    public void enterRoundabout() {
        if (waitingQueue.isEmpty()) {
            System.out.println("Queue Underflow! No vehicles waiting.");
            return;
        }

        String vehicleNumber = waitingQueue.poll();
        Vehicle newVehicle = new Vehicle(vehicleNumber);

        if (head == null) {
            head = tail = newVehicle;
            newVehicle.next = newVehicle;
        } else {
            tail.next = newVehicle;
            newVehicle.next = head;
            tail = newVehicle;
        }

        System.out.println("Vehicle entered roundabout: " + vehicleNumber);
    }

    // Remove vehicle from roundabout
    public void exitRoundabout(String vehicleNumber) {
        if (head == null) {
            System.out.println("Roundabout empty");
            return;
        }

        Vehicle current = head;
        Vehicle prev = tail;

        do {
            if (current.number.equals(vehicleNumber)) {

                if (current == head && current == tail) {
                    head = tail = null;
                } else {
                    prev.next = current.next;

                    if (current == head)
                        head = current.next;

                    if (current == tail)
                        tail = prev;
                }

                System.out.println("Vehicle exited: " + vehicleNumber);
                return;
            }

            prev = current;
            current = current.next;

        } while (current != head);

        System.out.println("Vehicle not found in roundabout");
    }

    // Display roundabout state
    public void displayRoundabout() {
        if (head == null) {
            System.out.println("Roundabout is empty");
            return;
        }

        Vehicle temp = head;
        System.out.print("Roundabout: ");

        do {
            System.out.print(temp.number + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(back to start)");
    }
}
