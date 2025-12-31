package MultilevelInheritance.EducationalCourseHierarchy;

// Create PaidOnlineCourse class
public class PaidOnlineCourse extends  OnlineCourse{
    private double fee;
    private double discount;

    // constructor
    public PaidOnlineCourse(String courseName, int duration,
                            String platform, boolean isRecorded,
                            double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    // Override the method to display course information
    @Override
    public void displayCourseInfo() {
        super.displayCourseInfo();
        System.out.println("Fee: $" + fee);
        System.out.println("Discount: " + discount + "%");
    }
}
