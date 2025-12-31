package SingleInheritance.LibraryManagementwithBooksandAuthors;

//author subclass inheriting properties of Book superclass
public class Author extends Book{
    // attributes
    private String name;
    private String biography;

    // constructor
    public Author(String title, int publicationYear, String name, String biography) {
        super(title, publicationYear);
        this.name = name;
        this.biography = biography;
    }

    // Override the displayInfo method from Book superclass
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author: " + name);
        System.out.println("Biography: " + biography);
    }
}
