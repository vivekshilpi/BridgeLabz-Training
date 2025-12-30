/*
Train Reservation Queue 🚆
Simulate a basic ticket booking system.
● Show menu with switch
● Allow multiple bookings using while-loop.
● Stop booking once seats reach zero (break).
*/

import java.util.Scanner;
public class ReservationQueue{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter total number of seats available : ");
		int seats = input.nextInt();
		int availableSeats = seats;
		int ticketBooked = 0;

		do{
			System.out.println("\nMenu Options : \n1). Train Name \n2). Available Seats \n3). Book Seat  \n4). Cancel Ticket \n5). Exit : ");
			int choice = input.nextInt();
			switch(choice){

			case 1:
				System.out.println("Chennai Express!");
				break;

			case 2:
				System.out.println("Available Seats are : " + availableSeats + "\nThank You!");
				break;

			case 3:
				System.out.println("Seat Successfully booked! Thank you! ");
				ticketBooked++;
				availableSeats--;
				break;

			case 4:
				if(ticketBooked>0){
					System.out.println("Ticket Cancelled Successfully! Thank you!");
				}else{
					System.out.println("Ticket not booked yet, Please Book Ticket first");
				}
				break;

			case 5:
				System.out.println("Thank you for Visiting!");
				return;

			}
		}while(availableSeats>0);
	}

}