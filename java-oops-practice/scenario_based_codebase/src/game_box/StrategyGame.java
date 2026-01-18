package game_box;

public class StrategyGame extends Game {

    StrategyGame(String title, double price, double rating) {
        super(title, "Strategy", price, rating);
    }

    public void download() {
        System.out.println(title + " downloaded (Strategic Gameplay)");
    }

    public void playDemo() {
        System.out.println("Demo: Plan moves and manage resources!");
    }
}