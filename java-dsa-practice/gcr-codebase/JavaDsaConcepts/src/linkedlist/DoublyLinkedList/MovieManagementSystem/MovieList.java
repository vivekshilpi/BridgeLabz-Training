package linkedlist.DoublyLinkedList.MovieManagementSystem;

class MovieList {
    private Movie head;
    private Movie tail;

    public MovieList() {
        head = null;
        tail = null;
    }

    // Add movie at the beginning
    public void addAtBeginning(String title, String director, int yearOfRelease, double rating) {
        Movie newMovie = new Movie(title, director, yearOfRelease, rating);
        if (head == null) {
            head = tail = newMovie;
        } else {
            newMovie.next = head;
            head.prev = newMovie;
            head = newMovie;
        }
    }

    // Add movie at the end
    public void addAtEnd(String title, String director, int yearOfRelease, double rating) {
        Movie newMovie = new Movie(title, director, yearOfRelease, rating);
        if (tail == null) {
            head = tail = newMovie;
        } else {
            tail.next = newMovie;
            newMovie.prev = tail;
            tail = newMovie;
        }
    }

    // Add movie at a specific position
    public void addAtPosition(String title, String director, int yearOfRelease, double rating, int position) {
        Movie newMovie = new Movie(title, director, yearOfRelease, rating);
        if (position == 1) {
            addAtBeginning(title, director, yearOfRelease, rating);
            return;
        }

        Movie current = head;
        for (int i = 1; i < position - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Position out of bounds.");
            return;
        }

        newMovie.next = current.next;
        newMovie.prev = current;

        if (current.next != null) {
            current.next.prev = newMovie;
        } else {
            tail = newMovie;
        }

        current.next = newMovie;
    }

    // Remove movie by title
    public void removeByTitle(String title) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Movie current = head;
        while (current != null && !current.title.equals(title)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Movie not found.");
            return;
        }

        if (current == head) {
            head = current.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
        } else if (current == tail) {
            tail = current.prev;
            tail.next = null;
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
    }

    // Search for movie by director or rating
    public void search(String searchTerm, Double minRating) {
        Movie current = head;
        boolean found = false;

        while (current != null) {
            if ((searchTerm != null && current.director.equals(searchTerm)) ||
                    (minRating != null && current.rating >= minRating)) {
                System.out.println("Found: " + current.title + ", Director: " + current.director +
                        ", Year: " + current.yearOfRelease + ", Rating: " + current.rating);
                found = true;
            }
            current = current.next;
        }

        if (!found) {
            System.out.println("No matching movie found.");
        }
    }

    // Display movies in forward order
    public void displayForward() {
        Movie current = head;
        while (current != null) {
            System.out.println(current.title + " - " + current.director + " - " + current.yearOfRelease + " - " + current.rating);
            current = current.next;
        }
    }

    // Display movies in reverse order
    public void displayReverse() {
        Movie current = tail;
        while (current != null) {
            System.out.println(current.title + " - " + current.director + " - " + current.yearOfRelease + " - " + current.rating);
            current = current.prev;
        }
    }

    // Update movie rating
    public void updateRating(String title, double newRating) {
        Movie current = head;
        while (current != null) {
            if (current.title.equals(title)) {
                current.rating = newRating;
                System.out.println("Rating updated for " + title);
                return;
            }
            current = current.next;
        }
        System.out.println("Movie not found.");
    }
}