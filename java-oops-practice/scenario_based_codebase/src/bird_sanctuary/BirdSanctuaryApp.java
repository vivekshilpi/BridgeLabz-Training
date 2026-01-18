package bird_sanctuary;

import java.util.*;

public class BirdSanctuaryApp {

    static ArrayList<Bird> birds = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\nWelcome to EcoWing Bird Sanctuary");
            System.out.println("1. Add Bird");
            System.out.println("2. Display All Birds");
            System.out.println("3. Display Flying Birds");
            System.out.println("4. Display Swimming Birds");
            System.out.println("5. Display Both Flying & Swimming Birds");
            System.out.println("6. Delete Bird by ID");
            System.out.println("7. Sanctuary Report");
            System.out.println("8. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> addBird();
                case 2 -> displayAll();
                case 3 -> displayFlying();
                case 4 -> displaySwimming();
                case 5 -> displayBoth();
                case 6 -> deleteBird();
                case 7 -> report();
                case 8 -> {
                    System.out.println("Thank you for protecting wildlife!");
                    return;
                }
                default -> System.out.println("Invalid option");
            }
        }
    }
    
    static void addBird() {
        System.out.println("Choose Bird Type:");
        System.out.println("1. Eagle  2. Duck  3. Penguin  4. Sparrow  5. Ostrich");

        int type = sc.nextInt();
        System.out.print("Enter ID: ");
        String id = sc.next();
        System.out.print("Enter Name: ");
        String name = sc.next();

        Bird bird = switch (type) {
            case 1 -> new Eagle(id, name);
            case 2 -> new Duck(id, name);
            case 3 -> new Penguin(id, name);
            case 4 -> new Sparrow(id, name);
            case 5 -> new Ostrich(id, name);
            default -> null;
        };

        if (bird != null) {
            birds.add(bird);
            System.out.println("Bird added successfully!");
        }
    }
    
    static void displayAll() {
        for (Bird b : birds) {
            b.displayInfo();
            abilities(b);
        }
    }
    
    static void displayFlying() {
        for (Bird b : birds) {
            if (b instanceof Flyable) {
                b.displayInfo();
                System.out.println("Flyable");
            }
        }
    }

    static void displaySwimming() {
        for (Bird b : birds) {
            if (b instanceof Swimmable) {
                b.displayInfo();
                System.out.println("Swimmable");
            }
        }
    }
    
    static void displayBoth() {
        for (Bird b : birds) {
            if (b instanceof Flyable && b instanceof Swimmable) {
                b.displayInfo();
                System.out.println("Flyable & Swimmable");
            }
        }
    }
    
    static void deleteBird() {
        System.out.print("Enter Bird ID to delete: ");
        String id = sc.next();

        birds.removeIf(b -> b.getId().equals(id));
        System.out.println("Bird removed if ID existed.");
    }
    
    static void report() {
        int fly = 0, swim = 0, both = 0, neither = 0;

        for (Bird b : birds) {
            boolean f = b instanceof Flyable;
            boolean s = b instanceof Swimmable;

            if (f && s) both++;
            else if (f) fly++;
            else if (s) swim++;
            else neither++;
        }

        System.out.println("Sanctuary Report:");
        System.out.println("Flyable: " + fly);
        System.out.println("Swimmable: " + swim);
        System.out.println("Both: " + both);
        System.out.println("Neither: " + neither);
    }
    
    static void abilities(Bird b) {
        if (b instanceof Flyable && b instanceof Swimmable)
            System.out.println("Flyable & Swimmable");
        else if (b instanceof Flyable)
            System.out.println("Flyable");
        else if (b instanceof Swimmable)
            System.out.println("Swimmable");
        else
            System.out.println("Neither");
    }
}