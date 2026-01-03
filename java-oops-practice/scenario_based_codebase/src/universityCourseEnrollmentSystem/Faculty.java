package universityCourseEnrollmentSystem;

class Faculty implements Graded {

    public void assignGrade(double marks) {
        double gpa;

        if (marks >= 90) gpa = 10;
        else if (marks >= 75) gpa = 8;
        else if (marks >= 60) gpa = 6;
        else if (marks >= 40) gpa = 4;
        else gpa = 0;

        System.out.println("Assigned GPA: " + gpa);
    }
}
