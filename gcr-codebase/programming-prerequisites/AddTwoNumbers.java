import java.util.*;

public class AddTwoNumbers{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first No : ");
		int num1 = sc.nextInt();
		System.out.println("Enter second No : ");
		int num2 = sc.nextInt();

		int sum = num1+num2;

		System.out.println("Sum of two numbers is : "+ sum);
	}
}