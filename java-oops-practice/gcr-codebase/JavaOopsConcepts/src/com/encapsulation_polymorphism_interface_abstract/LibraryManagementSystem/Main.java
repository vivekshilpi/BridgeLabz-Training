package LibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create library items
        Book book = new Book("B101", "The Great Gatsby", "F. Scott Fitzgerald", 180);
        Magazine magazine = new Magazine("M102", "National Geographic", "Various", "2023-10-01");
        DVD dvd = new DVD("D103", "Inception", "Christopher Nolan", 148);

        // Add items to a list
        List<LibraryItem> items = new ArrayList<>();
        items.add(book);
        items.add(magazine);
        items.add(dvd);

        // Process items using polymorphism
        for (LibraryItem item : items) {
            System.out.println("Processing Item: " + item.getTitle());
            item.getItemDetails();

            if (item instanceof Reservable) {
                ((Reservable) item).reserveItem("Alice");
                System.out.println("Availability: " + (((Reservable) item).checkAvailability() ? "Available" : "Not Available"));
            }

            System.out.println(); // For spacing
        }
    }
}