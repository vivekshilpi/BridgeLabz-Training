// including scanner class for taking user input
import java.util.Scanner;

public class PerimeterOfRectangle{
	public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble(); // Read the length

        System.out.print("Enter the width of the rectangle: ");
        double width = sc.nextDouble(); // Read the width

        // Calculate the perimeter
        double perimeter = 2 * (length + width);

        // Print perimeter
        System.out.println("The perimeter of the rectangle is: " + perimeter);

        sc.close(); // close the scanner
	}
}