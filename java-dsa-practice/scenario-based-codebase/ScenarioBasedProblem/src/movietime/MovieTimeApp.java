package sorting.movietime;

import java.time.LocalTime;
import java.util.Scanner;

public class MovieTimeApp {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of movies");
		int n = sc.nextInt();
		sc.nextLine();
		Movie[] movieList = new Movie[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("Enter movie name");
			String name = sc.nextLine();
			
			System.out.println("Enter show time (HH:mm):");
			String timeInput = sc.nextLine();   
	        LocalTime showTime = LocalTime.parse(timeInput);
	        
	        movieList[i] = new Movie(name, showTime);
		}
		
		SortMovies.insertionSort(movieList, n);
		
		System.out.println("Movie List : ");
		SortMovies.display(movieList);
	}

}
