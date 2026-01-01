package LibraryManagementSystem;

class DVD extends LibraryItem {
    private int runtime; // in minutes

    // Constructor
    public DVD(String itemId, String title, String author, int runtime) {
        super(itemId, title, author);
        this.runtime = runtime;
    }

    // Implement getLoanDuration() for DVD
    @Override
    public int getLoanDuration() {
        return 14; // DVDs can be loaned for 14 days
    }

    // Getter and Setter for runtime
    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }
}