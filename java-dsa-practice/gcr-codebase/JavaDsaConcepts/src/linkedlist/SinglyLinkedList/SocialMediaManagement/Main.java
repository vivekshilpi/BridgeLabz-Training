package linkedlist.SinglyLinkedList.SocialMediaManagement;

public class Main {
    public static void main(String[] args) {
        SocialMediaManager Instagram = new SocialMediaManager();

        // Add users
        Instagram.addUser("HARSH2024", "HARSH VEER SINGH", 22);
        Instagram.addUser("OM2024", "OM TIWARI", 22);
        Instagram.addUser("d2024", "depesh", 22);
        Instagram.addUser("durgesh", "durgesh", 22);
        Instagram.addUser("Bipin", "Bipin", 22);

        // Add a connection
        Instagram.addConnection("HARSH2024", "OM2024");
        Instagram.addConnection("HARSH2024", "d2024");
        Instagram.addConnection("HARSH2024", "vipin");
        // Add a connection
        Instagram.addConnection("OM2024", "durgesh");
        Instagram.addConnection("OM2024", "d2024");
        Instagram.findMutualFriends("HARSH2024","OM2024");

        Instagram.addConnection("vipin", "vipin");

        Instagram.removeConnection("HARSH2024","OM2024");

        // Display friends of a user
        Instagram.displayFriends("HARSH2024");
    }
}
