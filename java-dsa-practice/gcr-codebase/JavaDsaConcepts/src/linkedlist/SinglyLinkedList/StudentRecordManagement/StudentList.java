package linkedlist.SinglyLinkedList.StudentRecordManagement;

public class StudentList {

    Node head;
    public void addAtBeginning(int rollNumber, String name, int age, char grade){
        Node newStudent = new Node(rollNumber, name, age, grade);

        if(head == null) {
            head = newStudent;
            return;
        }
        newStudent.next = head;
        head = newStudent;
    }

    public void addAtEnd(int rollNumber, String name, int age, char grade){
        Node newStudent = new Node(rollNumber, name, age, grade);

        if(head == null) {
            head = newStudent;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newStudent;
    }

    public void addAtSpecificPosition(int position, int rollNumber, String name, int age, char grade){
        Node newStudent = new Node(rollNumber, name, age, grade);

        //checking if the linked list is empty then adding the new student to the head
        if(head == null) {
            head = newStudent;
            return;
        }

        //checking if we had to add at position 1
        if(position == 1){
            newStudent.next = head;
            head = newStudent;
            return;
        }

        //using temp node to traverse so that the value of head didn't get lost
        Node temp = head;

        //initialize a variable count with value 1
        int count = 1;

        while(temp.next != null && count < position -1){
            temp = temp.next;
            count++;
        }

        newStudent.next = temp.next;
        temp.next = newStudent;

    }

    //method to delete by roll number
    public void deleteByRollNumber(int rollNumber){

        //check if the list is empty
        if(head == null) {
            System.out.println("List is empty");
            return;
        }

        //check if the first students roll number match
        if(head.rollNumber == rollNumber){
            head = head.next;
            return;
        }

        //create a temp node and give it head's reference to traverse through the list
        Node temp = head;
        while(temp.next != null && temp.next.rollNumber != rollNumber){
            temp = temp.next;
        }
        if(temp.next == null){
            System.out.println("Roll number not found.");
            return;
        }
        else{
            temp.next = temp.next.next;
            System.out.println("Student with roll number "+ rollNumber + " deleted successfully.");
        }
    }

    //method to search by roll number
    public void searchByRollNumber(int rollNumber){
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            if(temp.rollNumber == rollNumber){
                System.out.println("Student found , details are: \nRoll Number: "+temp.rollNumber+"\nName: "+temp.name+"\nAge: "+temp.age+"\nGrade: "+temp.grade);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found.");
    }

    //method to update students grade
    public void updateGrade(int rollNumber, char newGrade){
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            if(temp.rollNumber == rollNumber){
                temp.grade = newGrade;
                System.out.println("Grade update for roll number "+ rollNumber);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found.");
    }
}
