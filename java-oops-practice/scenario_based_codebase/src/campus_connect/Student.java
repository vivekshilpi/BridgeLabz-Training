package campus_connect;

import java.util.ArrayList;

public class Student extends Person implements ICourseActions {

    private ArrayList<Integer> grades = new ArrayList<>();
    private ArrayList<Course> enrolledCourses = new ArrayList<>();

    public Student(int id, String name, String email) {
        super(id, name, email);
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    // GPA calculation using operators
    public double calculateGPA() {
        int sum = 0;
        for (int g : grades) sum += g;
        return grades.size() == 0 ? 0 : (double) sum / grades.size();
    }

    @Override
    public void enrollCourse(Course course) {
        enrolledCourses.add(course);
        course.addStudent(this);
        System.out.println(name + " enrolled in " + course.getCourseName());
    }

    @Override
    public void dropCourse(Course course) {
        enrolledCourses.remove(course);
        course.removeStudent(this);
        System.out.println(name + " dropped " + course.getCourseName());
    }

    // Polymorphism
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Role : Student");
        System.out.println("GPA : " + calculateGPA());
    }
}
