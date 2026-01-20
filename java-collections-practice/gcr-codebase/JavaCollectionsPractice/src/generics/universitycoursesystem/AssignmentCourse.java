package generics.universitycoursesystem;

public class AssignmentCourse extends CourseType {

    AssignmentCourse(String name) {
        super(name);
    }

    @Override
    void evaluate() {
        System.out.println(courseName + " evaluated by assignments");
    }
}
