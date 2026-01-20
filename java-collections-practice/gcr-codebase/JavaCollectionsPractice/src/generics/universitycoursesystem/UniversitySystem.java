package generics.universitycoursesystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UniversitySystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<CourseType> allCourses = new ArrayList<>();

        while (true) {

            System.out.println("\n--- University Course Management ---");
            System.out.println("1. Add Exam Course");
            System.out.println("2. Add Assignment Course");
            System.out.println("3. Add Research Course");
            System.out.println("4. Evaluate All Courses");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            if(choice==5) {
            	System.out.println("Thank you!!");
            	break;
            }

            switch (choice) {

                case 1:
                    System.out.print("Enter course name: ");
                    allCourses.add(new ExamCourse(sc.nextLine()));
                    break;

                case 2:
                    System.out.print("Enter course name: ");
                    allCourses.add(new AssignmentCourse(sc.nextLine()));
                    break;

                case 3:
                    System.out.print("Enter course name: ");
                    allCourses.add(new ResearchCourse(sc.nextLine()));
                    break;

                case 4:
                    UniversityUtil.evaluateAll(allCourses);
                    break;

                case 5:
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
        sc.close();
    }
}
