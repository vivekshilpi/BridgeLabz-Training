package foodloop;

public class VegItem extends FoodItem {

    public VegItem(String name, double price, int stock) {
        super(name, "Veg", price, stock);
    }

    @Override
    public void displayItem() {
        System.out.println(name + " | Veg | ₹" + price);
    }
}