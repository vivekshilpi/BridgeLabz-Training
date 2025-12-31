package SingleInheritance.LibraryManagementwithBooksandAuthors;

public class Book {
    private String title;
    private int publicationYear;

    // constructor
    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}
