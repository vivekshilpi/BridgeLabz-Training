package linkedlist.CircularLinkedList.OnlineTicketReservationSystem;

public class Main {
    public static void main(String[] args) {
        OnlineTicketReservationSystem system = new OnlineTicketReservationSystem();

        // Adding tickets
        system.addTicket(1, "Om", "Avatar", "A1");
        system.addTicket(2, "Harsh", "Titanic", "B2");
        system.addTicket(3, "Bipin", "Avatar", "A2");

        // Displaying tickets
        system.displayTickets();

        // Searching for a ticket
        System.out.println("\nSearching for tickets for 'Avatar':");
        system.searchTicket("Avatar");

        // Removing a ticket
        System.out.println("\nRemoving ticket with ID 2:");
        system.removeTicket(2);

        // Displaying tickets after removal
        system.displayTickets();

        // Total tickets count
        System.out.println("\nTotal number of tickets: " + system.getTotalTickets());
    }
}
