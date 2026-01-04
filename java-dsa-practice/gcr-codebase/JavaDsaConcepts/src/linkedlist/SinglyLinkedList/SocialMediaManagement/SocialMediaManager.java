package linkedlist.SinglyLinkedList.SocialMediaManagement;

public class SocialMediaManager {
    private Node head;

    // Add the new user to the social media platform
    void addUser(String userId, String name, int age) {
        if (!checkId(userId)) {
            System.out.println("User with ID " + userId + " already exists.");
            return;
        }
        Node newNode = new Node(userId, name, age);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }


    // Finding the friend using the user id
    Node findFriend(String friendId) {
        Node current = head;
        while (current != null) {
            if (current.userId.equals(friendId)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    // Add the connection between the two user
    void addConnection(String user1Id, String user2Id) {
        Node user1 = findFriend(user1Id);
        Node user2 = findFriend(user2Id);
        if (user1 == null) {
            System.out.println("User with ID " + user1Id + " not found.");
            return;
        }
        if (user2 == null) {
            System.out.println("User with ID " + user2Id + " not found.");
            return;
        }
        if (user1Id.equals(user2Id)) {
            System.out.println("A user cannot be friends with themselves.");
            return;
        }
        if (!user1.friendList.contains(user2Id)) {
            user1.friendList.add(user2Id);
        }
        if (!user2.friendList.contains(user1Id)) {
            user2.friendList.add(user1Id);
        }
    }
    // Check id is available or not
    public boolean checkId(String id) {
        Node current = head;
        while (current != null) {
            if (current.userId.equals(id)) {
                return false;
            }
            current = current.next;
        }
        return true;
    }

    // Remove the user from the user
    void removeConnection(String user1Id, String user2Id) {
        Node user1 = findFriend(user1Id);
        Node user2 = findFriend(user2Id);
        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        user1.friendList.remove(user2Id);
        user2.friendList.remove(user1Id);
        System.out.println("Connection removed between " + user1Id + " and " + user2Id);
    }

    // Find mutual friends between two users
    void findMutualFriends(String user1Id, String user2Id) {
        Node user1 = findFriend(user1Id);
        Node user2 = findFriend(user2Id);
        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        System.out.println("Mutual friends between " + user1.name + " and " + user2.name + ":");
        for (String friendId : user1.friendList) {
            if (user2.friendList.contains(friendId)) {
                Node mutualFriend = findFriend(friendId);
                if (mutualFriend != null) {
                    System.out.println("- " + mutualFriend.name + " (ID: " + mutualFriend.userId + ")");
                }
            }
        }
    }

    // Display the friendList of the user
    public void displayFriends(String userId) {
        Node user = findFriend(userId);
        if (user != null) {
            System.out.println("Friends of " + user.name + " (ID: " + user.userId + "):");
            for (String friendId : user.friendList) {
                Node friend = findFriend(friendId);
                if (friend != null) {
                    System.out.println("- " + friend.name + " (ID: " + friend.userId + ")");
                }
            }
        } else {
            System.out.println("User not found.");
        }
    }

}
