package game_box;

import java.util.*;

public class GameBoxApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        User user = new User("PlayerOne");

        List<Game> store = new ArrayList<>();

        store.add(new ArcadeGame("Speed Racer", 0, 4.5));
        store.add(new StrategyGame("War Tactics", 299, 4.7));
        store.add(new ArcadeGame("Jump Mania", 99, 4.2));

        while (true) {

            System.out.println("\n--- GameBox Menu ---");
            System.out.println("1. View Store Games");
            System.out.println("2. Play Demo");
            System.out.println("3. Buy / Download Game");
            System.out.println("4. Apply Seasonal Discount");
            System.out.println("5. View My Games");
            System.out.println("6. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1 -> {
                    for (int i = 0; i < store.size(); i++) {
                        System.out.print((i + 1) + ". ");
                        store.get(i).displayGame();
                    }
                }

                case 2 -> {
                    System.out.print("Select game number: ");
                    int idx = sc.nextInt() - 1;
                    store.get(idx).playDemo();
                }

                case 3 -> {
                    System.out.print("Select game number: ");
                    int idx = sc.nextInt() - 1;
                    Game g = store.get(idx);
                    g.download();
                    user.addGame(g);
                }

                case 4 -> {
                    System.out.print("Enter discount %: ");
                    double d = sc.nextDouble();
                    for (Game g : store) {
                        g.applyDiscount(d);
                    }
                    System.out.println("Discount applied");
                }

                case 5 -> user.showLibrary();

                case 6 -> {
                    System.out.println("GameBox closed");
                    return;
                }

                default -> System.out.println("Invalid choice");
            }
        }
    }
}
