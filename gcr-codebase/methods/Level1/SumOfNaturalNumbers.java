//importing the Scanner class for taking user inputs
import java.util.Scanner;
public class SumOfNaturalNumbers{
	static void sum(int number){
		int sum = number * (number + 1)/2;
		System.out.println("The sum of "+number+" natural numbers is "+ sum);
	}
	public static void main(String[]args){
            
		//Create an instance of Scanner class to take user inputs
		Scanner input = new Scanner(System.in);
			
		//Create a int variable named number and take input from user
		System.out.println("Enter number: ");
		int number = input.nextInt();	
		
		// function calling
        sum(int number);
		
	    //Closing the scanner object
	    input.close();
	}
}