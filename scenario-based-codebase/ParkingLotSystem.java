/*
Parking Lot Gate System 
Develop a smart parking system.
● Options: Park, Exit, Show Occupancy
● Use switch-case for the menu.
● while loop to continue until the parking lot is full or the user exits.
*/

import java.util.Scanner;
public class ParkingLotSystem{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int capacity = 5;
        int occupancy =0;

		while(occupancy<capacity){
			System.out.println("\nMenu options: (Park, Exit, Show Occupancy:");
            String option = input.nextLine().toLowerCase();

            switch(option){
            case "park":
            	System.out.println("Vehicle Succesfully parked!");
            	occupancy++;
            	break;

            case "show occupancy":
            	System.out.println("Total occupied cars : "+occupancy);
            	break;

            case "exit":
            	System.out.println("Thanks, Visit Again!");
            	//occupancy=capacity;
            	//break;
            	return;

            default:
            	System.out.println("Enter Valid Input!");
            	continue;
            }
		}
		input.close();
	}
}