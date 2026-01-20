package generics.universitycoursesystem;

public class ExamCourse extends CourseType {

    ExamCourse(String name) {
        super(name);
    }

    @Override
    void evaluate() {
        System.out.println(courseName + " evaluated by final exam");
    }
}
