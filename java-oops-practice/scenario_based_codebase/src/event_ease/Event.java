package event_ease;

abstract class Event implements ISchedulable {
    private static int idCounter = 1000;
    private final int eventId;      // cannot be edited once assigned
    protected String eventName;
    protected String location;
    protected String date;
    protected int attendees;
    private double basePrice;

    protected boolean catering;
    protected boolean decoration;

    protected double totalCost;

    public Event(String eventName, String location, String date, int attendees, double basePrice) {
        this.eventId = ++idCounter;
        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.attendees = attendees;
        this.basePrice = basePrice;
    }

    // Constructor Overloading (Packages)
    public Event(String eventName, String location, String date, int attendees, double basePrice,
                 boolean catering, boolean decoration) {
        this(eventName, location, date, attendees, basePrice);
        this.catering = catering;
        this.decoration = decoration;
    }

    protected double calculateCost() {
        double cost = basePrice;

        if (catering) cost += attendees * 300;
        if (decoration) cost += 5000;

        if (attendees > 100) cost -= 2000; // discount

        totalCost = cost;
        return cost;
    }

    public int getEventId() {
        return eventId;
    }
}

