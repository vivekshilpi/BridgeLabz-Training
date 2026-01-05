package swift_cart;

public interface ICheckout {
    void generateBill();
    void applyDiscount(double couponAmount);
}

