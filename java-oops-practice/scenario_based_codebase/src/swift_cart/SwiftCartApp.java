package swift_cart;

public class SwiftCartApp {
    public static void main(String[] args) {

        Product milk = new PerishableProduct("Milk", 50, "Dairy");
        Product rice = new NonPerishableProduct("Rice", 60, "Grains");

        Cart cart = new Cart();
        cart.addProduct(milk, 2);
        cart.addProduct(rice, 3);

        cart.applyDiscount(20);   // coupon
        cart.generateBill();
    }
}

