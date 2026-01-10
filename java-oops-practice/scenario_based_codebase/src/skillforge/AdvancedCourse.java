package skillforge;

public class AdvancedCourse extends Course {

    public AdvancedCourse(String title, Instructor instructor) {
        super(title, instructor);
    }

    @Override
    public void generateCertificate() {
        System.out.println("Advanced Course Certificate");
        System.out.println("Awarded for mastering advanced professional skills.");
    }
}
