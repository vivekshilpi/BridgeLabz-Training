package LibraryManagementSystem;

public class Book extends LibraryItem implements Reservable {
    private int numberOfPages;
    private boolean isReserved;
    private String borrowerName;

    // Constructor
    public Book(String itemId, String title, String author, int numberOfPages) {
        super(itemId, title, author);
        this.numberOfPages = numberOfPages;
        this.isReserved = false;
        this.borrowerName = null;
    }

    // Implement getLoanDuration()
    @Override
    public int getLoanDuration() {
        return 21; // Books can be loaned for 21 days
    }

    // Implement Reservable interface methods
    @Override
    public void reserveItem(String borrowerName) {
        if (!isReserved) {
            this.borrowerName = borrowerName;
            this.isReserved = true;
            System.out.println("Book reserved by: " + borrowerName);
        } else {
            System.out.println("Book is already reserved by: " + this.borrowerName);
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }

    // Override getItemDetails() to include reservation status
    @Override
    public void getItemDetails() {
        super.getItemDetails();
        System.out.println("Reservation Status: " + (isReserved ? "Reserved by " + borrowerName : "Available"));
    }
}