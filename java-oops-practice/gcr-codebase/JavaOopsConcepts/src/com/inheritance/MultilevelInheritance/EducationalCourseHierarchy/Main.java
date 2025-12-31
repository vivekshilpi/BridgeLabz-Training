package MultilevelInheritance.EducationalCourseHierarchy;

public class Main {
    public static void main(String[] args) {

        // Create object
        PaidOnlineCourse advancedCourse = new PaidOnlineCourse(
                "Advanced Java",
                40,
                "Udemy",
                true,
                199.99,
                10.0);

        // Call the method from the PaidOnlineCourse class
        advancedCourse.displayCourseInfo();
    }
}
