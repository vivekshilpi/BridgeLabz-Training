package generics.smartwarehousemanagementsystem;

import java.util.List;

public class WarehouseUtil {

    public static void displayItems(List<? extends WarehouseItem> items) {

        if (items.isEmpty()) {
            System.out.println("No items available.");
            return;
        }

        for (WarehouseItem item : items) {
            item.displayInfo();
        }
    }
}
