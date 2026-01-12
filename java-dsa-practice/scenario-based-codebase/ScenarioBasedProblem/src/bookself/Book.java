package bookself;

public class Book {
    String name;
    boolean isAvailable;

    public Book(String name) {
        this.name = name;
        this.isAvailable = true;
    }

    @Override
    public String toString() {
        return name + " (" + (isAvailable ? "Available" : "Borrowed") + ")";
    }
}
