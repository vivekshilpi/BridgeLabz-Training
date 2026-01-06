package event_ease;

import java.util.Scanner;

public class EventEaseApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Organizer Name: ");
        String uname = sc.nextLine();
        System.out.print("Enter Email: ");
        String email = sc.nextLine();
        System.out.print("Enter Phone: ");
        String phone = sc.nextLine();

        User user = new User(uname, email, phone);

        System.out.print("Select Event Type (1-Birthday 2-Conference): ");
        int type = sc.nextInt();
        sc.nextLine();

        System.out.print("Event Name: ");
        String ename = sc.nextLine();
        System.out.print("Location: ");
        String loc = sc.nextLine();
        System.out.print("Date: ");
        String date = sc.nextLine();
        System.out.print("Attendees: ");
        int att = sc.nextInt();

        System.out.print("Catering? (true/false): ");
        boolean cat = sc.nextBoolean();
        System.out.print("Decoration? (true/false): ");
        boolean dec = sc.nextBoolean();

        Event event;

        if (type == 1)
            event = new BirthdayEvent(ename, loc, date, att, cat, dec);
        else
            event = new ConferenceEvent(ename, loc, date, att, cat, dec);

        System.out.println("\nOrganizer: " + user.getName());
        System.out.println("Event ID: " + event.getEventId());

        event.schedule();
    }
}

