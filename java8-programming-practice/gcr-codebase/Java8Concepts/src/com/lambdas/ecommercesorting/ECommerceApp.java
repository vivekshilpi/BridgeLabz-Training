package com.lambdas.ecommercesorting;
import java.util.*;

public class ECommerceApp {

	public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 65000, 4.5, 10));
        products.add(new Product("Phone", 30000, 4.8, 15));
        products.add(new Product("Headphones", 3000, 4.2, 25));

        ProductSorter.sortProducts(products, "price");
        products.forEach(System.out::println);
    }
}
