//including scanner package to take input
import java.util.Scanner;

public class AreaOfCircle{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		//Taking radius of circle as input from user
		System.out.println("Enter radius of circle : ");
		double radius = input.nextDouble();
		
		//calculating area of circle
		double area = Math.PI * (radius * radius);

		//printing the area of circle
		System.out.println("Area of circle is " + area);
		
		input.close();
		
	}
}