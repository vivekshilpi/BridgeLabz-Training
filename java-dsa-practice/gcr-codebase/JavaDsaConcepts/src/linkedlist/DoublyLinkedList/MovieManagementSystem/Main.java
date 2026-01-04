package linkedlist.DoublyLinkedList.MovieManagementSystem;

public class Main {
    public static void main(String[] args) {
        MovieList movieList = new MovieList();

        // Add movies
        movieList.addAtEnd("Inception", "Christopher Nolan", 2010, 9.0);
        movieList.addAtBeginning("Titanic", "James Cameron", 1997, 8.7);
        movieList.addAtPosition("The Dark Knight", "Christopher Nolan", 2008, 9.1, 2);

        // Display movies
        System.out.println("Movies in forward order:");
        movieList.displayForward();

        System.out.println("\nMovies in reverse order:");
        movieList.displayReverse();

        // Search for a movie
        System.out.println("\nSearch by director (Christopher Nolan):");
        movieList.search("Christopher Nolan", null);

        System.out.println("\nSearch by rating (>= 8.9):");
        movieList.search(null, 8.9);

        // Update rating
        System.out.println("\nUpdate rating for Titanic:");
        movieList.updateRating("Titanic", 9.0);
        movieList.displayForward();

        // Remove a movie
        System.out.println("\nRemove The Dark Knight:");
        movieList.removeByTitle("The Dark Knight");
        movieList.displayForward();
    }
}
