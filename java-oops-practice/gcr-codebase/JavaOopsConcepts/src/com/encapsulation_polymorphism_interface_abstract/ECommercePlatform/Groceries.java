package ECommercePlatform;

public class Groceries extends Product implements Taxable{
    private int weight;

    @Override
    public double calculateDiscount() {
        return getPrice()+calculateTax()-getPrice()*0.20;
    }

    @Override
    public double calculateTax() {
        return getPrice() *0.05;
    }

    @Override
    public String getTaxDetails() {
        return "5% GST";
    }

    public Groceries(int productId, String name, int price, int weight) {
        super(productId, name, price);
        this.weight = weight;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Price : "+calculateDiscount());
    }
}
