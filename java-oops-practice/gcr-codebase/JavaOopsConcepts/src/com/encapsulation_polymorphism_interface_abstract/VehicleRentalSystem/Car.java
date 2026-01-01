package VehicleRentalSystem;

public class Car extends Vehicle implements Insurable{
    private int seats;


    @Override
    public double calculateInsurance() {

        return getRentalRate()*0.20;
    }

    @Override
    public String getInsurance() {
        return "20% of Rental Rate";
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate()*days;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Insurance : "+calculateInsurance());
        System.out.println("Total Rent: "+calculateRentalCost(getDays()
        ));
    }

    public Car(int vehicleNumber, String type, int rentalRate, int seats, int days) {
        super(vehicleNumber, type, rentalRate,days);
        this.seats = seats;
    }
}
