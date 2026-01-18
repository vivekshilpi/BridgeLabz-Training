package cinema_house;

class CinemaSorter {

    static void sortByTime(Show[] shows) {
        int n = shows.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                // Compare showtimes as strings (HH:MM format preserves order)
                if (shows[j].time.compareTo(shows[j + 1].time) > 0) {

                    // Swap adjacent shows
                    Show temp = shows[j];
                    shows[j] = shows[j + 1];
                    shows[j + 1] = temp;
                }
            }
        }
    }
}
