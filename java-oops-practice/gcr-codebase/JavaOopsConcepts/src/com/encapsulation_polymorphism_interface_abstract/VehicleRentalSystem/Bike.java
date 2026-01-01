package VehicleRentalSystem;

public class Bike extends Vehicle implements Insurable{
    private String company;
    public Bike(int vehicleNumber, String type, int rentalRate, String company,int days) {
        super(vehicleNumber, type, rentalRate,days);
        this.company = company;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Insurance : "+calculateInsurance());
        System.out.println("Total Rent :"+calculateRentalCost(getDays()));
    }

    @Override
    public double calculateInsurance() {

        return getRentalRate()*0.10;
    }

    @Override
    public String getInsurance() {
        return "10% of Rental Rate";
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate()*days;
    }
}