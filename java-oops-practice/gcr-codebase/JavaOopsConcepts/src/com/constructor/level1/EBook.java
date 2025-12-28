package com.constructor.level1;

public class EBook extends BookLibrarySystem{
	double fileSize; 

    // Constructor
    EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    // Method demonstrating access modifiers
    void displayDetails() {
        System.out.println("ISBN     : " + ISBN);      
        System.out.println("Title    : " + title);     
        System.out.println("Author   : " + getAuthor());
        System.out.println("FileSize : " + fileSize + " MB");
    }
}
