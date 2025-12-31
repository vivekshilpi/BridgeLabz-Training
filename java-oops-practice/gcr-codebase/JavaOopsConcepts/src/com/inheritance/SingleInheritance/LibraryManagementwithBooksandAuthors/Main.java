package SingleInheritance.LibraryManagementwithBooksandAuthors;

public class Main {
    public static void main(String[] args) {

        // Create object
        Author bookAuthor = new Author("Java Basics", 2022, "Om Tiwari", "Expert Programmer");
        // call the method from the class
        bookAuthor.displayInfo();

        System.out.println("\n-------------------\n");
    }
}
