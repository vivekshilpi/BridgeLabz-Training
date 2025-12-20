//importing the Scanner class for taking user inputs
import java.util.Scanner;

public class SimpleInterest {
    // Function to calculate Simple Interest
	static void calculateSI(double principal, double rate , double time){
		//Create an variable named simpleInterest to store the result
		double simpleInterest =   (principal*rate*time)/100;
			
		//Displaying result
        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);

	}
	public static void main(String[]args){
       
		Scanner input =new Scanner(System.in);
			
		//Create an variable named principal  and take input from user
		System.out.println("Enter principal amount: ");
		double principal  = input.nextInt();
			
		//Create an variable named rate and take input from user
		System.out.println("Enter rate of interest: ");
		double rate  = input.nextInt();
			
		//Create an variable named time and take input from user
		System.out.println("Enter time period: ");
		double time  = input.nextInt();
        
        // calling function
	    calculateSI(principal, rate , time);
			
	    //Closing the scanner object
	    input.close();
	}
}