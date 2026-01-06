package event_ease;

class ConferenceEvent extends Event {

    public ConferenceEvent(String name, String loc, String date, int att, boolean cat, boolean dec) {
        super(name, loc, date, att, 20000, cat, dec);
    }

    @Override
    public void schedule() {
        System.out.println("📊 Conference Scheduled: " + eventName);
        System.out.println("Total Cost: ₹" + calculateCost());
    }

    @Override
    public void reschedule(String newDate) {
        this.date = newDate;
        System.out.println("Conference rescheduled to " + newDate);
    }

    @Override
    public void cancel() {
        System.out.println("Conference cancelled.");
    }
}

