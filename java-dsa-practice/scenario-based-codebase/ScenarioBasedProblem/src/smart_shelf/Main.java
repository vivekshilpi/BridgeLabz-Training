package smart_shelf;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many books to add: ");
        int n = sc.nextInt();

        Book[] shelf = new Book[n];

        for(int i = 0; i < n; i++) {

            System.out.print("Enter Book Title: ");
            String title = sc.next();

            shelf[i] = new Book(title);

            SmartShelf.insertAndSort(shelf, i + 1);

            System.out.println("Current SmartShelf:");
            for(int j = 0; j <= i; j++) shelf[j].display();
            System.out.println();
        }
    }
}
