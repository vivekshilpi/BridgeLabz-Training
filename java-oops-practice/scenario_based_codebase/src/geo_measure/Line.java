package geo_measure;

public class Line {

    // Encapsulation: private data members
    private double x1, y1, x2, y2;

    // Constructor to initialize the line
    public Line(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    // Method to calculate length of the line
    public double calculateLength() {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

    // Method to return coordinates (optional, for display)
    public String getCoordinates() {
        return "(" + x1 + ", " + y1 + ") to (" + x2 + ", " + y2 + ")";
    }
}
