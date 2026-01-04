package linkedlist.CircularLinkedList.OnlineTicketReservationSystem;

import java.time.LocalDateTime;
import java.util.*;

public class Ticket {
    int ticketID;
    String customerName;
    String movieName;
    String seatNumber;
    LocalDateTime bookingTime;
    Ticket next;

    public Ticket(int ticketID, String customerName, String movieName, String seatNumber, LocalDateTime bookingTime) {
        this.ticketID = ticketID;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = null;
    }
}