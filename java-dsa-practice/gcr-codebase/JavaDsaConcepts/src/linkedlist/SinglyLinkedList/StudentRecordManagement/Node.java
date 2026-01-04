package linkedlist.SinglyLinkedList.StudentRecordManagement;

//create a node class
public class Node{

    //create attributes
    int rollNumber;
    String name;
    int age;
    char grade;
    Node next;

    //create constructor
    public Node(int rollNumber, String name, int age, char grade ){
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}
