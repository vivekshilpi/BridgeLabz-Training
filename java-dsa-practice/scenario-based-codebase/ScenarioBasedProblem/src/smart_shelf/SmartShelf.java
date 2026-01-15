package smart_shelf;

class SmartShelf {

    static void insertAndSort(Book[] shelf, int totalBooks) {

        for(int i = 1; i < totalBooks; i++) {

            Book key = shelf[i];
            int j = i - 1;

            while(j >= 0 && shelf[j].title.compareToIgnoreCase(key.title) > 0) {
                shelf[j + 1] = shelf[j];
                j--;
            }
            shelf[j + 1] = key;
        }
    }
}
