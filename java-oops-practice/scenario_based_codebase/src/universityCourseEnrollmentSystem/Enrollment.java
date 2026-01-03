package universityCourseEnrollmentSystem;

class Enrollment implements Graded {
    Student student;
    Course course;

    public Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    public void assignGrade(double marks) {
        double gpa;

        if (marks >= 40)
            gpa = 4.0;
        else
            gpa = 0.0;

        student.setGPA(gpa);
    }
}
