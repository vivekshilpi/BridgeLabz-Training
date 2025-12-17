// Writing java program to find the discounted amount and discounted price the student will pay for the course
public class DiscountedCollegeFee{
      public static void main(String[] args){
               
            // Creating a int variable fee to store the fee of student 
            int fee = 125000;
            // Creating a int variable discountPercent
            int discountPercent = 10;
            // Creating a int variable discountAmount to store the discounted amount
            int discountAmount = (fee * 10)/100 ;
            // Creating a int variable discountedPrice to store the fee of student after discount
            int discountedPrice = fee - discountAmount;

            // Print result
            System.out.println("The discount amount is INR "+ discountAmount + " and final discounted fee is INR "+  discountedPrice);
      }
}