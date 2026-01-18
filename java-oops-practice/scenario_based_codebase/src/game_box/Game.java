package game_box;

abstract class Game implements IDownloadable {

    protected String title;
    protected String genre;
    protected double price;
    protected double rating;

    Game(String title, String genre, double price, double rating) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    // seasonal offer
    public void applyDiscount(double percent) {
        price = price - (price * percent / 100);
    }

    public void displayGame() {
        System.out.println(title + " | Genre: " + genre +
                " | Price: Rs" + price + " | Rating: " + rating);
    }
}