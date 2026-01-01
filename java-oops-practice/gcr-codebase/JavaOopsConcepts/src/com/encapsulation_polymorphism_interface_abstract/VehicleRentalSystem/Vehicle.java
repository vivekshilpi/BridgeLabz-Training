package VehicleRentalSystem;

public abstract class Vehicle {
    private int vehicleNumber;
    private String type;
    private int rentalRate;
    private int days;
    public abstract double calculateRentalCost(int days);
    public void getDetails(){
        System.out.println("Vehicle Number "+vehicleNumber);
        System.out.println("Type of Vehicle: "+type);
        System.out.println("Rental Rate : "+rentalRate );
    }
    public int getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(int vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(int rentalRate) {
        this.rentalRate = rentalRate;
    }

    public int getDays() {
        return days;
    }

    public Vehicle(int vehicleNumber, String type, int rentalRate, int days) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.days = days;
        this.rentalRate = rentalRate;
    }
}