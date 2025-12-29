/*
Shopkeeper’s Discount Dashboard 
A shopkeeper gives discounts based on total bill:
● Input item prices in a for-loop.
● Use if-else for discount logic.
*/

import java.util.Scanner;
public class DiscountDashboard{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter total number of items : ");
    int items = sc.nextInt();

    double bill = 0.0;
    for(int i=1;i<=items;i++){
    	System.out.println("Enter price of item "+ i + " : ");
    	double itemPrice = sc.nextDouble();
    	if(itemPrice<=0){
    		System.out.println("Invalid item price");
    	}
    	else if(itemPrice<999){
    		// if items price less than 999 then no discount
    		bill+=itemPrice;
    	}
    	else if(itemPrice>=999 && itemPrice<1999){
    		// give 5% discount
    		bill+=(itemPrice*0.05);
    	}
    	else if(itemPrice>=1999 && itemPrice<2999){
    		// give 10% discount
    		bill+=(itemPrice*0.10);
    	}
    	else{
            // above 2999 give 20%
            bill+=(itemPrice*0.20);
    	}

    }
    System.out.println("-----------Bill Details-----------");
    System.out.println("Total no. of items purchased : " + items);
    System.out.println("Total bill to be paid : " + bill);
	}
}