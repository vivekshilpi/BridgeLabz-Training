package linkedlist.SinglyLinkedList.StudentRecordManagement;

public class Main {
    public static void main(String[] args) {

        //create linkedList of students
        StudentList list = new StudentList();

        //adding student to the list
        System.out.println("------ADDING STUDENT AT BEGINNING--------");
        list.addAtBeginning(115, "Om", 22, 'A');
        list.addAtBeginning(68, "Harshveer", 22, 'B');

        //create an object of DisplayLinkedList class
        DisplayLinkedList display = new DisplayLinkedList();

        //invoke displayLinkedList method to display the details of student
        display.displayLinkedList(list.head);

        System.out.println("------AFTER DELETION--------");
        //invoke delete method which takes roll number as parameter
        list.deleteByRollNumber(115);
        display.displayLinkedList(list.head);

        System.out.println("-----_ADDING STUDENT AT LAST-------");
        //invoke delete method to add new student at last
        list.addAtEnd(07, "Abhinav", 23, 'D');
        list.addAtEnd(15, "Abhishek", 23, 'F');
        display.displayLinkedList(list.head);

        System.out.println("-------ADDING AT SPECIFIC INDEX-------");
        //Method to add new student at specific index
        list.addAtSpecificPosition(2,18,"Adarsh", 23, 'P');
        display.displayLinkedList(list.head);

        System.out.println("--------SEARCH BY ROLL NUMBER------");
        list.searchByRollNumber(07);

        System.out.println("--------UPDATING STUDENT GRADE-----");
        list.updateGrade(07,'A');

        //display all students record
        display.displayLinkedList(list.head);
    }
}
