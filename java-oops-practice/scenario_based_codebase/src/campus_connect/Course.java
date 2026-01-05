package campus_connect;

import java.util.ArrayList;

public class Course {

    private String courseName;
    private Faculty faculty;
    private ArrayList<Student> students = new ArrayList<>();

    public Course(String courseName, Faculty faculty) {
        this.courseName = courseName;
        this.faculty = faculty;
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public void removeStudent(Student s) {
        students.remove(s);
    }

    public void printCourseDetails() {
        System.out.println("\nCourse : " + courseName);
        System.out.println("Faculty : " + faculty.name);
        System.out.println("Enrolled Students : " + students.size());
    }
}

