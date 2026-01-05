package campus_connect;

public class CampusConnectApp {
    public static void main(String[] args) {

        Faculty f1 = new Faculty(1, "Dr. Sharma", "sharma@college.edu", "Computer Science");

        Course javaCourse = new Course("Java Programming", f1);

        Student s1 = new Student(101, "Vivek", "vivek@gmail.com");
        Student s2 = new Student(102, "Ananya", "ananya@gmail.com");

        s1.addGrade(85);
        s1.addGrade(90);
        s2.addGrade(80);
        s2.addGrade(88);

        s1.enrollCourse(javaCourse);
        s2.enrollCourse(javaCourse);

        s1.printDetails();
        s2.printDetails();
        f1.printDetails();

        javaCourse.printCourseDetails();
    }
}

