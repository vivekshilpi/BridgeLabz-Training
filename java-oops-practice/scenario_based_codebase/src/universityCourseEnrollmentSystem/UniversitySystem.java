package universityCourseEnrollmentSystem;

public class UniversitySystem {
    public static void main(String[] args) {

        Student s1 = new Undergraduate(101, "Vivek");
        Student s2 = new Postgraduate(102, "Aman");

        Course java = new Course(1, "Core Java");

        Enrollment e1 = new Enrollment(s1, java);
        Faculty f1 = new Faculty();

        e1.assignGrade(82);      // Pass/Fail style
        f1.assignGrade(92);      // Letter style

        s1.display();
        System.out.println("Student GPA: " + s1.getGPA());
    }
}
