import java.util.Scanner;
public class QuotientRemainder{
	
	//function to find quotient and remainder
	static void findQR(int num1, int num2){
	//performing division operation and modulo operation
	int quotient = num1/num2;
	int remainder = num1%num2;

	//printing the result
	System.out.println( "The Quotient is " + quotient + " and Reminder is " + remainder + " of two number " + num1 + " and " + num2 );
	}
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	//taking input 
	int num1 = input.nextInt();
	int num2 = input.nextInt();

	//call the function
	findQR(num1, num2);
	}
}