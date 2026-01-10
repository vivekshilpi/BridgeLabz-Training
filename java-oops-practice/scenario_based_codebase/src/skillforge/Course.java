package skillforge;

import java.util.*;

public abstract class Course implements ICertifiable {

    protected String title;
    protected Instructor instructor;
    protected List<String> modules;

    private double rating;           // encapsulated
    private final List<String> reviews = new ArrayList<>();  // read-only internally

    // Default modules constructor
    public Course(String title, Instructor instructor) {
        this.title = title;
        this.instructor = instructor;
        this.modules = List.of("Introduction", "Core Concepts", "Final Assessment");
    }

    // Custom modules constructor
    public Course(String title, Instructor instructor, List<String> modules) {
        this.title = title;
        this.instructor = instructor;
        this.modules = modules;
    }

    // Encapsulated rating logic
    protected void updateRating(double newRating) {
        rating = (rating + newRating) / 2;
    }

    public double getRating() {
        return rating;
    }

    // Read-only access
    public List<String> getReviews() {
        return Collections.unmodifiableList(reviews);
    }

    public void addReview(String review) {
        reviews.add(review);
    }

    public void displayCourse() {
        System.out.println("\nCourse: " + title);
        System.out.println("Instructor: " + instructor.name);
        System.out.println("Modules: " + modules);
        System.out.println("Rating: " + rating);
    }
}
