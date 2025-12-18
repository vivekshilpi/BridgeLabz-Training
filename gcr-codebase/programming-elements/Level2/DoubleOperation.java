import java.util.Scanner;
public class DoubleOperation{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//taking input
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();

		//performing operations
		double op1 = a + b * c;
		double op2 = a * b + c;
		double op3 = c + a / b;
		double op4 = a % b + c;

		//printing result
		System.out.println( "The results of Int Operations are " + op1 + ", " + op2 + ", " + op3 + ", " + op4);
	}
}