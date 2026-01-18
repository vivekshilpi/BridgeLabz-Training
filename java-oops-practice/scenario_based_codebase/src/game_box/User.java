package game_box;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String name;
    private List<Game> ownedGames = new ArrayList<>();

    User(String name) {
        this.name = name;
    }

    public void addGame(Game g) {
        ownedGames.add(g);
        System.out.println(g.getTitle() + " added to library");
    }

    public void showLibrary() {
        System.out.println("\n--- " + name + "'s Game Library ---");
        if (ownedGames.isEmpty()) {
            System.out.println("No games owned");
            return;
        }
        for (Game g : ownedGames) {
            g.displayGame();
        }
    }
}