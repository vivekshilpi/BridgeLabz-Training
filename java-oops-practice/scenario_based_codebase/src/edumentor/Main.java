package edumentor;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter learner name: ");
        String name = sc.nextLine();

        System.out.print("Enter email: ");
        String email = sc.nextLine();

        System.out.print("Enter user ID: ");
        int userId = sc.nextInt();
        sc.nextLine();

        System.out.print("Course type (short / fulltime): ");
        String courseType = sc.nextLine().toLowerCase();

        System.out.print("Choose difficulty (easy / medium / hard): ");
        String difficulty = sc.nextLine().toLowerCase();

        Quiz quiz = new Quiz();

        System.out.println("\n--- QUIZ STARTED ---");
        quiz.conductQuiz(difficulty, sc);

        Learner learner;
        if (courseType.equals("short")) {
            learner = new ShortCourseLearner(name, email, userId, quiz);
        } else {
            learner = new FullTimeLearner(name, email, userId, quiz);
        }

        System.out.println("\nFinal Score: " + quiz.getScore());
        System.out.println("Percentage: " + quiz.calculatePercentage() + "%");

        learner.generateCertificate();

        sc.close();
    }
}
