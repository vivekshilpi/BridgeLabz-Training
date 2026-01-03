package cabbygo;

public class Driver {

    private String name;
    private String licenseNumber;
    private double rating;   // sensitive

    public Driver(String name, String licenseNumber, double rating) {
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public void displayDriverInfo() {
        System.out.println("Driver Name : " + name);
        System.out.println("Rating : " + rating);
    }
}
