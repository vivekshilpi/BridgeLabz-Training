package sorting.movietime;

public class SortMovies {
	
	public static void insertionSort(Movie[] movieList, int n) {
		
		for(int i=1; i<n; i++) {
			Movie key = movieList[i];
			int j=i-1;
			
			while(j>=0 && movieList[i].showTime.compareTo(key.showTime) > 0) {
				movieList[j+1] = movieList[j];
				j--;
			}
			
			movieList[j+1] = key;
		}
		
	}
	
	public static void display(Movie[] movieList) {
		for(Movie m : movieList) {
			System.out.print("Movie Name: " + m.name);
			System.out.println(" Movie Time: " + m.showTime);
		}
	}
}
