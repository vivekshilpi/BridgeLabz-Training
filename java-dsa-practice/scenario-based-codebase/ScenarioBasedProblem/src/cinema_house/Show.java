package cinema_house;

class Show {
    String movie;
    String time;   // Format: HH:MM (24-hour)

    Show(String movie, String time) {
        this.movie = movie;
        this.time = time;
    }

    void display() {
        System.out.println(time + " → " + movie);
    }
}
