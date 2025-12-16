//including scanner package to take input
import java.util.Scanner;

public class AddTwoNumbers{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Taking number1 as input from user
		System.out.println("Enter number1: ");
		int number1  = input.nextInt();
		
		//Taking number2 as input from user
		System.out.println("Enter number2: ");
		int number2  = input.nextInt();

		int sum = number1+number2;

		//printing sum
		System.out.println("Sum of two numbers is : "+ sum);

		//closing scanner
		input.close();
	}
}