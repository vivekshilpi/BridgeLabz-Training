package linkedlist.DoublyLinkedList.LibraryManagementSystem;

public class Main {
    public static void main(String[] args) {
        LibraryManagementSystem library = new LibraryManagementSystem();

        library.addBook("Book1", "Author1", "Fiction", 101, true, 0);
        library.addBook("Book2", "Author2", "Mystery", 102, true, 1);
        library.addBook("Book3", "Author3", "Horror", 103, true, 1);

        System.out.println("All books in forward order:");
        library.displayBooksForward();

        System.out.println("\nAll books in reverse order:");
        library.displayBooksReverse();

        System.out.println("\nSearching for 'Author2':");
        library.searchBook("Author2");

        System.out.println("\nUpdating availability of Book ID 102:");
        library.updateAvailability(102, false);
        library.displayBooksForward();

        System.out.println("\nRemoving Book ID 103:");
        library.removeBook(103);
        library.displayBooksForward();

        System.out.println("\nTotal number of books: " + library.getTotalBooks());
    }
}
