package com.lambdas.ecommercesorting;
import java.util.*;

class ProductSorter {

	 public static void sortProducts(List<Product> products, String campaign) {

	        switch (campaign.toLowerCase()) {

	            case "price":
	                products.sort((p1, p2) -> Double.compare(p1.price, p2.price));
	                break;

	            case "rating":
	                products.sort((p1, p2) -> Double.compare(p2.rating, p1.rating));
	                break;

	            case "discount":
	                products.sort((p1, p2) -> Double.compare(p2.discount, p1.discount));
	                break;

	            default:
	                System.out.println("Invalid campaign type");
	        }
	    }
}
