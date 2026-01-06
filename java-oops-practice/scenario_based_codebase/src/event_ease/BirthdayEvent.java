package event_ease;

class BirthdayEvent extends Event {

    public BirthdayEvent(String name, String loc, String date, int att, boolean cat, boolean dec) {
        super(name, loc, date, att, 8000, cat, dec);
    }

    @Override
    public void schedule() {
        System.out.println("🎂 Birthday Event Scheduled: " + eventName);
        System.out.println("Total Cost: ₹" + calculateCost());
    }

    @Override
    public void reschedule(String newDate) {
        this.date = newDate;
        System.out.println("Birthday event rescheduled to " + newDate);
    }

    @Override
    public void cancel() {
        System.out.println("Birthday event cancelled.");
    }
}
