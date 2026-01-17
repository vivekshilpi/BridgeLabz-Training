package icecream_rush;

public class Main {
    public static void main(String[] args) {

        Flavor[] flavors = {
            new Flavor("Vanilla", 45),
            new Flavor("Chocolate", 62),
            new Flavor("Strawberry", 38),
            new Flavor("Butterscotch", 55),
            new Flavor("Mango", 50),
            new Flavor("Black Currant", 40),
            new Flavor("Pista", 30),
            new Flavor("Coffee", 28)
        };

        System.out.println("Before Sorting (Weekly Sales):");
        for (Flavor f : flavors) f.display();

        IceCreamSorter.sortByPopularity(flavors);

        System.out.println("\nAfter Sorting (Most Popular First):");
        for (Flavor f : flavors) f.display();
    }
}
