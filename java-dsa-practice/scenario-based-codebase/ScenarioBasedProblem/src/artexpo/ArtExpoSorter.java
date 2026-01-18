package artexpo;

public class ArtExpoSorter {

    // Inserts the latest artist into the correct position by time
    static void insertByTime(Artist[] list, int totalArtists) {

        Artist key = list[totalArtists - 1];   // Newly registered artist
        int j = totalArtists - 2;

        // Shift later registrations to the right
        while (j >= 0 && list[j].registrationTime > key.registrationTime) {
            list[j + 1] = list[j];
            j--;
        }

        // Place new artist in correct position
        list[j + 1] = key;
    }
}
