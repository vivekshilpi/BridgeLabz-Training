// Writing java code to convert kilometers to miles
//including scanner package
import java.util.Scanner;

public class KilometersToMilesAdvance{
      public static void main(String[] args){
            // Creating scanner object
            Scanner input = new Scanner(System.in);
            System.out.print("Enter distance in Km : ");
           
            // Creating a double variable to take input of distance in kilometers
            double km = input.nextDouble();
            // Creating a double variable to calculate distance in kilometers which may come in decimal
            double distanceInMiles = km * 1.6;

            // Displaying result
            System.out.println("The distance " + km + " km in miles is " + distanceInMiles);

            input.close();

       }
}