package tourmate;

public class InternationalTrip extends Trip {

    public InternationalTrip(String destination, int duration,
                             Transport transport, Hotel hotel, Activity activity) {
        super(destination, duration, transport, hotel, activity);
    }

    @Override
    public void book() {
        System.out.println("International trip booked to " + getDestination());
        System.out.println("Passport and visa verified");
        System.out.println("Total Budget: " + getBudget());
    }

    @Override
    public void cancel() {
        System.out.println("International trip cancelled with charges");
    }
}
