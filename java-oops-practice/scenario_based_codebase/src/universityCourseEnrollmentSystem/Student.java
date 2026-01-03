package universityCourseEnrollmentSystem;

abstract class Student {
    private double gpa;     // Encapsulated

    protected String name;
    protected int id;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public double getGPA() {        // Public access method
        return gpa;
    }

    protected void setGPA(double gpa) {
        this.gpa = gpa;
    }

    public abstract void display();
}
