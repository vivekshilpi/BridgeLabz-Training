package com.constructor.level1;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product("Pencil",20);
		
		Product p2 = new Product("Pen",10);
		
		p1.displayProductDetails();
		p2.displayProductDetails();
		
		Product.displayTotalProducts();
	}

}
