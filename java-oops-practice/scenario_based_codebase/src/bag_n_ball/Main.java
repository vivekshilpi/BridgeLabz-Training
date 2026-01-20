package bag_n_ball;

public class Main {
    public static void main(String[] args) {

        Bag bag1 = new Bag("B01", "Red", 2);
        Bag bag2 = new Bag("B02", "Blue", 3);

        Ball ball1 = new Ball("BL1", "Yellow", "Small");
        Ball ball2 = new Ball("BL2", "Green", "Medium");
        Ball ball3 = new Ball("BL3", "Red", "Large");

        bag1.addBall(ball1);
        bag1.addBall(ball2);
        bag1.addBall(ball3); // Should be prevented (capacity full)

        bag1.displayBalls();

        bag1.removeBall("BL2");
        bag1.displayBalls();

        BagManager manager = new BagManager();
        manager.addBag(bag1);
        manager.addBag(bag2);

        manager.displayAllBags();
    }
}
