package MultilevelInheritance.EducationalCourseHierarchy;

public class Course {
    private String courseName;
    private int duration;

    // constructor
    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    // Make a method to display course information
    public void displayCourseInfo() {
        System.out.println("Course: " + courseName);
        System.out.println("Duration: " + duration + " hours");
    }
}
