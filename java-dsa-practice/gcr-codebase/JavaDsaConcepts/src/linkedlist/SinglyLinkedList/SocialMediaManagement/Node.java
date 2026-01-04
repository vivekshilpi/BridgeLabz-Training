package linkedlist.SinglyLinkedList.SocialMediaManagement;

import java.util.ArrayList;

public class Node {
    String userId;
    String name;
    int age;
    ArrayList<String> friendList;
    Node next;

    public Node(String userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friendList = new ArrayList<>();
        this.next = null;
    }
}
