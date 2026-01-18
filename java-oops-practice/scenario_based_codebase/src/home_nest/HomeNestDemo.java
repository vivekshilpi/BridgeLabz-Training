package home_nest;

import java.util.Scanner;

public class HomeNestDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HomeNestManager manager = new HomeNestManager();

        while (true) {

            System.out.println("\n--- HomeNest Smart Home Menu ---");
            System.out.println("1. Add Device");
            System.out.println("2. Turn ON Device");
            System.out.println("3. Turn OFF Device");
            System.out.println("4. Reset Device");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1 -> {
                    System.out.println("Choose Device Type:");
                    System.out.println("1. Light  2. Camera  3. Thermostat  4. Lock");
                    int type = sc.nextInt();

                    System.out.print("Enter Device ID: ");
                    String id = sc.next();

                    Device d = switch (type) {
                        case 1 -> new Light(id);
                        case 2 -> new Camera(id);
                        case 3 -> new Thermostat(id);
                        case 4 -> new Lock(id);
                        default -> null;
                    };

                    if (d != null) manager.addDevice(d);
                    else System.out.println("Invalid device type");
                }

                case 2 -> {
                    System.out.print("Enter Device ID: ");
                    manager.turnOnDevice(sc.next());
                }

                case 3 -> {
                    System.out.print("Enter Device ID: ");
                    manager.turnOffDevice(sc.next());
                }

                case 4 -> {
                    System.out.print("Enter Device ID: ");
                    manager.resetDevice(sc.next());
                }

                case 5 -> {
                    System.out.println("HomeNest system closed");
                    return;
                }

                default -> System.out.println("Invalid choice");
            }
        }
    }
}