package binary_search_tree.music_app;

import java.util.Scanner;

public class MusicApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SongBST library = new SongBST();

        while (true) {
            System.out.println("""
 
            Music App – Song Library
            1. Add New Track
            2. Search Track by ID
            3. Show Playlist Alphabetically
            4. Exit
            """);

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1 -> {
                    System.out.print("Enter Track ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Song Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Artist Name: ");
                    String artist = sc.nextLine();

                    library.insert(id, title, artist);
                    System.out.println("✅ Track added.");
                }

                case 2 -> {
                    System.out.print("Enter Track ID to search: ");
                    library.searchByTrackId(sc.nextInt());
                }

                case 3 -> library.displayAlphabetical();

                case 4 -> {
                    System.out.println("Exiting Music App 👋");
                    sc.close();
                    return;
                }

                default -> System.out.println("Invalid choice.");
            }
        }
    }
}

