import java.util.Scanner;
public class IntOperation{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//taking input
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();

		//performing operations
		int op1 = a + b * c;
		int op2 = a * b + c;
		int op3 = c + a / b;
		int op4 = a % b + c;

		//printing result
		System.out.println( "The results of Int Operations are " + op1 + ", " + op2 + ", " + op3 + ", " + op4);
	}
}