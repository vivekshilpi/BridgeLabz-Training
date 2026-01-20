package generics.universitycoursesystem;

public class ResearchCourse extends CourseType {

    ResearchCourse(String name) {
        super(name);
    }

    @Override
    void evaluate() {
        System.out.println(courseName + " evaluated by research work");
    }
}