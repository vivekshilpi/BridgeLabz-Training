// Writing java code to calculate Profit or loss
public class CalculateProfitLoss{
      public static void main(String[] args){
            // Creating a int variable to store cost price 
             int costPrice = 129;
            // Creating a int variable to store selling price 
             int sellingPrice = 191;
            // Creating a int variable to calculate and store profit 
             int profit = sellingPrice - costPrice;
            // Creating a double variable to store profit percentage 
             double profitPercentage = (profit  * 100 ) / costPrice;

            // Displaying result
            System.out.println("The Cost Price is INR "+ costPrice +" and Selling Price is INR "+ sellingPrice + " \nThe Profit is INR " + profit + " and the Profit Percentage is "+ profitPercentage );
       }
}