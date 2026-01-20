package generics.smartwarehousemanagementsystem;

public class Furniture extends WarehouseItem {

    Furniture(String name) {
        super(name);
    }

    @Override
    void displayInfo() {
        System.out.println("Furniture: " + name);
    }
}
