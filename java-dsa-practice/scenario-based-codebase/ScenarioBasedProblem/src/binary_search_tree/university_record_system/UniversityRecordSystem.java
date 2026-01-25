package binary_search_tree.university_record_system;

import java.util.Scanner;

public class UniversityRecordSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentBST bst = new StudentBST();

        while (true) {
            System.out.println("""
            
            University Digital Record System
            1. Insert Student
            2. Delete Student
            3. Search Student
            4. Display Sorted Students
            5. Exit
            """);

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1 -> {
                    System.out.print("Enter Roll Number: ");
                    int roll = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

                    bst.insert(roll, name);
                    System.out.println("Student inserted successfully.");
                }

                case 2 -> {
                    System.out.print("Enter Roll Number to delete: ");
                    bst.delete(sc.nextInt());
                    System.out.println("Student deleted (if existed).");
                }

                case 3 -> {
                    System.out.print("Enter Roll Number to search: ");
                    bst.search(sc.nextInt());
                }

                case 4 -> bst.displayInOrder();

                case 5 -> {
                    System.out.println("Exiting system 👋");
                    sc.close();
                    return;
                }

                default -> System.out.println("Invalid choice.");
            }
        }
    }
}

