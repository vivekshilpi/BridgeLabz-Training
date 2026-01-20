package generics.universitycoursesystem;

public class Course<T extends CourseType> {

    private T courseType;

    Course(T courseType) {
        this.courseType = courseType;
    }

    public T getCourseType() {
        return courseType;
    }

    public void conductEvaluation() {
        courseType.evaluate();
    }
}
