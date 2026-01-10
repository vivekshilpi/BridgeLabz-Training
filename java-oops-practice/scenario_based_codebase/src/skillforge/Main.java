package skillforge;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create instructor
        Instructor instructor = new Instructor("Dr. Rahul Verma");

        // Take student name
        System.out.print("Enter student name: ");
        String studentName = sc.nextLine();
        Student student = new Student(studentName);

        // Course selection
        System.out.println("\nSelect course level:");
        System.out.println("1. Beginner");
        System.out.println("2. Advanced");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        Course selectedCourse;

        if (choice == 1) {
            selectedCourse = new BeginnerCourse("Java Foundations", instructor);
        } else if (choice == 2) {
            selectedCourse = new AdvancedCourse("Spring Boot Mastery", instructor);
        } else {
            System.out.println("Invalid choice.");
            sc.close();
            return;
        }

        // Display course details
        selectedCourse.displayCourse();

        // User-defined progress input
        System.out.print("\nEnter completed modules count: ");
        int completedModules = sc.nextInt();

        System.out.print("Enter total modules count: ");
        int totalModules = sc.nextInt();

        student.updateProgress(completedModules, totalModules);

        // User-defined grading input
        System.out.print("Enter marks obtained: ");
        int marksObtained = sc.nextInt();

        System.out.print("Enter total marks: ");
        int totalMarks = sc.nextInt();

        student.calculateScore(marksObtained, totalMarks);

        // Display progress
        System.out.println("\nProgress: " + student.getProgress() + "%");
        System.out.println("Score: " + student.getScore() + "%");

        // Certificate generation (polymorphism)
        if (student.getProgress() == 100 && student.getScore() >= 60) {
            System.out.println("\nCongratulations!");
            selectedCourse.generateCertificate();
        } else {
            System.out.println("\nCertificate not generated.");
            System.out.println("Completion or passing criteria not met.");
        }

        sc.close();
    }
}
