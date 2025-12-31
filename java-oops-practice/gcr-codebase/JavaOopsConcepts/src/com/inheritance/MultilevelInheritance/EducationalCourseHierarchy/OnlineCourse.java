package MultilevelInheritance.EducationalCourseHierarchy;

// Create OnlineCourse class
public class OnlineCourse extends Course {
    private String platform;
    private boolean isRecorded;

    // constructor
    public OnlineCourse(String courseName, int duration,
                        String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    // Override the method display course information
    @Override
    public void displayCourseInfo() {
        super.displayCourseInfo();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}
