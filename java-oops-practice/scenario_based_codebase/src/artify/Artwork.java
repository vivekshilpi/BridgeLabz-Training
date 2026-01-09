package artify;

public abstract class Artwork implements IPurchasable {

    protected String title;
    protected String artist;
    protected double price;
    protected String licenseType;      // Encapsulated (Protected)
    protected boolean hasPreview;

    public Artwork(String title, String artist, double price, String licenseType) {
        this(title, artist, price, licenseType, false);
    }

    public Artwork(String title, String artist, double price, String licenseType, boolean hasPreview) {
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.licenseType = licenseType;
        this.hasPreview = hasPreview;
    }

    protected void deductAmount(User user) {
        user.walletBalance -= price;
    }

    public abstract void license(User user);
}
