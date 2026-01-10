package skillforge;

public class BeginnerCourse extends Course {

    public BeginnerCourse(String title, Instructor instructor) {
        super(title, instructor);
    }

    @Override
    public void generateCertificate() {
        System.out.println("Beginner Course Certificate");
        System.out.println("Awarded for completing foundational skills.");
    }
}
