import java.util.Scanner;
public class DivisionFunction{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	//taking input 
	int num1 = input.nextInt();
	int num2 = input.nextInt();

	//performing division operation and modulo operation
	int quotient = num1/num2;
	int remainder = num1%num2;

	//printing the result
	System.out.println( "The Quotient is " + quotient + " and Reminder is " + remainder + " of two number " + num1 + " and " + num2 );
	}
}