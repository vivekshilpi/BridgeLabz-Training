package com.constructor.level1;

public class BookLibrarySystem {
	// Access modifiers
    public String ISBN;
    protected String title;
    private String author;

    // Constructor
    BookLibrarySystem(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Setter for author (private variable)
    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter for author (private variable)
    public String getAuthor() {
        return author;
    }
}
