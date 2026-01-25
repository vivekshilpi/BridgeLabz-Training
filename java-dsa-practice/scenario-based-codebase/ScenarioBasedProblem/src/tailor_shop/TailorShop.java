package tailor_shop;

class TailorShop {
    Order[] orders;
    int size;

    TailorShop(int capacity) {
        orders = new Order[capacity];
        size = 0;
    }

    void addOrder(Order newOrder) {
        orders[size] = newOrder;
        size++;
        insertionSort();
    }

    // Insertion Sort based on delivery deadline
    void insertionSort() {
        for (int i = 1; i < size; i++) {
            Order key = orders[i];
            int j = i - 1;

            while (j >= 0 && orders[j].deliveryDeadline > key.deliveryDeadline) {
                orders[j + 1] = orders[j];
                j--;
            }
            orders[j + 1] = key;
        }
    }

    void displayOrders() {
        System.out.println("\nOrders Sorted by Delivery Deadline:");
        for (int i = 0; i < size; i++) {
            orders[i].display();
        }
    }
}
