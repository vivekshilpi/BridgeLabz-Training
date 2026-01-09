package artify;

public class DigitalArt extends Artwork {

    public DigitalArt(String title, String artist, double price, String licenseType) {
        super(title, artist, price, licenseType);
    }

    public DigitalArt(String title, String artist, double price, String licenseType, boolean preview) {
        super(title, artist, price, licenseType, preview);
    }

    @Override
    public void purchase(User user) {
        if (user.walletBalance >= price) {
            deductAmount(user);
            System.out.println(user.name + " purchased Digital Art: " + title);
        } else {
            System.out.println("Insufficient wallet balance.");
        }
    }

    @Override
    public void license(User user) {
        System.out.println("Digital License applied: " + licenseType);
    }
}

