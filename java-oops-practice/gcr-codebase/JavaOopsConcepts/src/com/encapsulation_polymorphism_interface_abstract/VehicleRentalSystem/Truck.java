package VehicleRentalSystem;

public class Truck extends Vehicle implements Insurable{
    private int wheels;

    public Truck(int vehicleNumber, String type, int rentalRate, int days, int wheels) {
        super(vehicleNumber, type, rentalRate, days);
        this.wheels = wheels;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate()*0.30;
    }

    @Override
    public String getInsurance() {
        return "30 % of Rental Rate";
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate()*days;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Insurance : "+calculateInsurance());
        System.out.println("Total rent: "+calculateRentalCost(getDays()));
    }
}
