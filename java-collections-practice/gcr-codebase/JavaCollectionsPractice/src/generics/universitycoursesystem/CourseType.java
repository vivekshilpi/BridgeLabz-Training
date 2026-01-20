package generics.universitycoursesystem;

abstract class CourseType {

    String courseName;

    CourseType(String courseName) {
        this.courseName = courseName;
    }

    abstract void evaluate();
}
