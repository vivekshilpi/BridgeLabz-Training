package ECommercePlatform;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Groceries g1 = new Groceries(1,"Apple",100,1);
        Electronics e1 = new Electronics(2,"AC",40000,2);
        Clothing c1 = new Clothing(3,"Hoodie", 2000, 36);
        List<Product> products = new ArrayList<>();
        products.add(g1);
        products.add(e1);
        products.add(c1);

        for(Product product: products){
            product.getDetails();
            System.out.println();
        }
    }
}
