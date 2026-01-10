package foodloop;

public class NonVegItem extends FoodItem {

    public NonVegItem(String name, double price, int stock) {
        super(name, "Non-Veg", price, stock);
    }

    @Override
    public void displayItem() {
        System.out.println(name + " | Non-Veg | ₹" + price);
    }
}