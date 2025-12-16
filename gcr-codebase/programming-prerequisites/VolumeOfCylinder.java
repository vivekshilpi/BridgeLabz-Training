//including scanner package to take input
import java.util.Scanner;

public class VolumeOfCylinder{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the radius of the cylinder:");
        double radius = input.nextDouble(); // Read radius
        
        System.out.println("Enter the height of the cylinder:");
        double height = input.nextDouble(); // Read height

		//calculate the volume of cylinder
		double volume = Math.PI * radius * radius * height;

        // print volume
		System.out.println("Volume of cylinder is " + volume);
		
		input.close();
		
	}
}