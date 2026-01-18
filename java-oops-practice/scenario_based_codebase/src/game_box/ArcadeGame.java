package game_box;

public class ArcadeGame extends Game {

    ArcadeGame(String title, double price, double rating) {
        super(title, "Arcade", price, rating);
    }

    public void download() {
        System.out.println(title + " downloaded (Fast-paced Arcade Game)");
    }

    public void playDemo() {
        System.out.println("Demo: Quick levels with high speed action!");
    }
}
