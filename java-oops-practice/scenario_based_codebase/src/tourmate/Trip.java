package tourmate;

public abstract class Trip implements IBookable {

    private String destination;
    private int duration;
    private double budget;

    // Associated services
    protected Transport transport;
    protected Hotel hotel;
    protected Activity activity;

    // Constructor to build complete trip package
    public Trip(String destination, int duration,
                Transport transport, Hotel hotel, Activity activity) {

        this.destination = destination;
        this.duration = duration;
        this.transport = transport;
        this.hotel = hotel;
        this.activity = activity;

        // Operator usage: total budget calculation
        this.budget = transport.getCost()
                    + hotel.getCost()
                    + activity.getCost();
    }

    public double getBudget() {
        return budget;
    }

    public String getDestination() {
        return destination;
    }

    public int getDuration() {
        return duration;
    }
}
