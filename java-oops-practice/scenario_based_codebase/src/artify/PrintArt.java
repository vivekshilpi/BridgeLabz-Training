package artify;

public class PrintArt extends Artwork {

    public PrintArt(String title, String artist, double price, String licenseType) {
        super(title, artist, price, licenseType);
    }

    @Override
    public void purchase(User user) {
        if (user.walletBalance >= price) {
            deductAmount(user);
            System.out.println(user.name + " purchased Print Art: " + title);
        } else {
            System.out.println("Insufficient wallet balance.");
        }
    }

    @Override
    public void license(User user) {
        System.out.println("Print License applied: " + licenseType + " (Physical Copy Rights)");
    }
}

