package generics.smartwarehousemanagementsystem;

public class Electronics extends WarehouseItem {

    Electronics(String name) {
        super(name);
    }

    @Override
    void displayInfo() {
        System.out.println("Electronics: " + name);
    }
}
