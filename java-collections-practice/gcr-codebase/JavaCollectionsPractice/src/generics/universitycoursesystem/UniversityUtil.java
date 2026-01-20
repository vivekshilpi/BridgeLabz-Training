package generics.universitycoursesystem;

import java.util.List;

public class UniversityUtil {

    public static void evaluateAll(List<? extends CourseType> courses) {

        for (CourseType course : courses) {
            course.evaluate();
        }
    }
}
