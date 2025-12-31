package HybridInheritance.RestaurantManagementSystem;


public class Main {
    public static void main(String[] args) {

        // Create object of Chef class
        Chef chef = new Chef("John Doe", "CH001", "Italian");
        // Call method of chef object from Chef class
        chef.performDuties();

        // Create object of Waiter class
        Waiter waiter = new Waiter("Jane Smith", "WT001", "Main Hall");
        // call method of waiter object from Waiter class
        waiter.performDuties();

        System.out.println("\n-------------------\n");
    }
}
