package smart_library;

class SmartLibrary {

    static void insertAndSort(Book[] shelf, int totalBooks) {

        Book key = shelf[totalBooks - 1];  
        int j = totalBooks - 2;

        while (j >= 0 && shelf[j].title.compareToIgnoreCase(key.title) > 0) {
            shelf[j + 1] = shelf[j];  
            j--;
        }

        shelf[j + 1] = key;   
    }
}
