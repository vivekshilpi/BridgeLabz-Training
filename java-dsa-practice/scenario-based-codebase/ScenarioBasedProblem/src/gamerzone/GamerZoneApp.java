package sorting.gamerzone;

import java.util.Scanner;

public class GamerZoneApp {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of players :");
		int n = sc.nextInt();
		sc.nextLine();
		
		Player[] playersList = new Player[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("Enter name of player:");
			String name = sc.nextLine();
			System.out.println("Enter score (out of 100):");
			double score = sc.nextDouble();
			sc.nextLine();
			
			playersList[i] = new Player(name, score) ;
		}
		
		PlayerSorting.quickSort(playersList, 0, n-1);
		
		PlayerSorting.display(playersList);
	}

}
