package artify;

public class ArtifyApp {
    public static void main(String[] args) {

        User user = new User("Vivek", 5000);

        Artwork art1 = new DigitalArt("AI Portrait", "Rahul", 1500, "Commercial", true);
        Artwork art2 = new PrintArt("Mountain Canvas", "Neha", 2500, "Personal");

        art1.purchase(user);
        art1.license(user);

        art2.purchase(user);
        art2.license(user);

        System.out.println("Remaining Wallet Balance: " + user.walletBalance);
    }
}

