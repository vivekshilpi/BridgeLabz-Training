package linkedlist.DoublyLinkedList.LibraryManagementSystem;

public class LibraryManagementSystem {
    private Book head;
    private Book tail;
    private int count;

    public LibraryManagementSystem() {
        this.head = null;
        this.tail = null;
        this.count = 0;
    }

    // Add a new book
    public void addBook(String title, String author, String genre, int bookID, boolean isAvailable, int position) {
        Book newBook = new Book(title, author, genre, bookID, isAvailable);
        if (position <= 0 || head == null) { // Add at the beginning
            newBook.next = head;
            if (head != null) {
                head.prev = newBook;
            }
            head = newBook;
            if (tail == null) {
                tail = newBook;
            }
        } else if (position >= count) { // Add at the end
            newBook.prev = tail;
            if (tail != null) {
                tail.next = newBook;
            }
            tail = newBook;
            if (head == null) {
                head = newBook;
            }
        } else { // Add at specific position
            Book current = head;
            for (int i = 0; i < position - 1; i++) {
                current = current.next;
            }
            newBook.next = current.next;
            newBook.prev = current;
            if (current.next != null) {
                current.next.prev = newBook;
            }
            current.next = newBook;
        }
        count++;
    }

    // Remove a book by Book ID
    public void removeBook(int bookID) {
        Book current = head;
        while (current != null && current.bookID != bookID) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Book not found.");
            return;
        }
        if (current.prev != null) {
            current.prev.next = current.next;
        } else {
            head = current.next;
        }
        if (current.next != null) {
            current.next.prev = current.prev;
        } else {
            tail = current.prev;
        }
        count--;
        System.out.println("Book removed successfully.");
    }

    // Search for a book by Title or Author
    public void searchBook(String keyword) {
        Book current = head;
        boolean found = false;
        while (current != null) {
            if (current.title.equalsIgnoreCase(keyword) || current.author.equalsIgnoreCase(keyword)) {
                System.out.println("Book Found: [Title: " + current.title + ", Author: " + current.author + ", Genre: " + current.genre + ", ID: " + current.bookID + ", Available: " + current.isAvailable + "]");
                found = true;
            }
            current = current.next;
        }
        if (!found) {
            System.out.println("No book found with the given keyword.");
        }
    }

    // Update Availability Status
    public void updateAvailability(int bookID, boolean isAvailable) {
        Book current = head;
        while (current != null) {
            if (current.bookID == bookID) {
                current.isAvailable = isAvailable;
                System.out.println("Availability status updated.");
                return;
            }
            current = current.next;
        }
        System.out.println("Book not found.");
    }

    // Display all books in forward order
    public void displayBooksForward() {
        Book current = head;
        while (current != null) {
            System.out.println("[Title: " + current.title + ", Author: " + current.author + ", Genre: " + current.genre + ", ID: " + current.bookID + ", Available: " + current.isAvailable + "]");
            current = current.next;
        }
    }

    // Display all books in reverse order
    public void displayBooksReverse() {
        Book current = tail;
        while (current != null) {
            System.out.println("[Title: " + current.title + ", Author: " + current.author + ", Genre: " + current.genre + ", ID: " + current.bookID + ", Available: " + current.isAvailable + "]");
            current = current.prev;
        }
    }

    // Count the total number of books
    public int getTotalBooks() {
        return count;
    }
}