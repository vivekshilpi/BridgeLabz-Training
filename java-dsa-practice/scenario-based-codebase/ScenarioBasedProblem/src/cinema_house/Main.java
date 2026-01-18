package cinema_house;

public class Main {
    public static void main(String[] args) {

        Show[] dailyShows = {
            new Show("Avengers", "18:30"),
            new Show("Dune", "14:15"),
            new Show("Spider-Man", "20:00"),
            new Show("Oppenheimer", "16:45"),
            new Show("Avatar", "12:30")
        };

        System.out.println("Before Sorting (Raw Schedule):");
        for (Show s : dailyShows) s.display();

        CinemaSorter.sortByTime(dailyShows);

        System.out.println("\nAfter Sorting (Chronological Order):");
        for (Show s : dailyShows) s.display();
    }
}
