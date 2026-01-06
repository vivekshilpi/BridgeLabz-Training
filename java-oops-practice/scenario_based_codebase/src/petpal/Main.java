package petpal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Choose pet (dog / cat / bird): ");
        String petType = sc.nextLine().toLowerCase();

        System.out.print("Enter pet name: ");
        String name = sc.nextLine();

        System.out.print("Enter pet age: ");
        int age = sc.nextInt();

        Pet pet;

        switch (petType) {
            case "dog":
                pet = new Dog(name, age);
                break;
            case "cat":
                pet = new Cat(name, age);
                break;
            case "bird":
                pet = new Bird(name, age);
                break;
            default:
                System.out.println("Invalid pet type");
                sc.close();
                return;
        }

        System.out.println("\nYour pet is ready!");
        pet.makeSound();
        System.out.println("Current mood: " + pet.getMood());

        System.out.println("\n1. Feed\n2. Play\n3. Sleep");
        System.out.print("Choose an action: ");
        int action = sc.nextInt();

        switch (action) {
            case 1:
                pet.feed();
                break;
            case 2:
                pet.play();
                break;
            case 3:
                pet.sleep();
                break;
            default:
                System.out.println("Invalid action");
        }

        System.out.println("Updated mood: " + pet.getMood());

        sc.close();
    }
}
