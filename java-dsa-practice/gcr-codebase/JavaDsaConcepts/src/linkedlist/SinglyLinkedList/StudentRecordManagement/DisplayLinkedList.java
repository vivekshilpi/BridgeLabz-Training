package linkedlist.SinglyLinkedList.StudentRecordManagement;

//method to display students record
public class DisplayLinkedList{
    public void displayLinkedList(Node head){
        Node temp = head;

        if(temp == null){
            return;
        }
        while(temp != null){
            System.out.println("Student RollNumber: "+temp.rollNumber+ "\nStudent Name: "+ temp.name + "\nStudent Age: "+ temp.age + "\nStudent grade: "+temp.grade);
            temp = temp.next;
            System.out.println("------------------------");
        }
    }
}
