// importing scanner class for user input
import java.util.Scanner;

public class KilometersToMiles{
      public static void main(String[] args){
            Scanner input = new Scanner(System.in);

            // taking user input in kilometers
             double distanceInKilometers = input.nextDouble();

            //calculate distance in miles
             double miles = 10.8 * 0.621371;

             // print result
             System.out.println("The distance in miles is : " + miles);

             input.close();
       }
}