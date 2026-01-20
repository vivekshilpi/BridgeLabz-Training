package bag_n_ball;

import java.util.ArrayList;

class BagManager {
    private ArrayList<Bag> bags = new ArrayList<>();

    public void addBag(Bag bag) {
        bags.add(bag);
    }

    public void displayAllBags() {
        System.out.println("\n=== All Bags ===");
        for (Bag b : bags) {
            System.out.println(b + " | Ball Count = " + b.getBallCount());
        }
    }
}
