/*
Online Quiz Application 
Ask 5 questions (MCQs) from a user.
● Use arrays and for-loop.
● Record score.
● Switch for answer checking. Apply clear indentation and structured layout.
*/
import java.util.Scanner;
public class OnlineQuizApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Questions
        String[] questions = {
            "1. Which keyword is used to inherit a class in Java?",
            "2. Which method is the entry point of Java program?",
            "3. Which data type is used to store decimal values?",
            "4. Which company developed Java?",
            "5. Which loop is best when number of iterations is known?"
        };

        // Options
        String[][] options = {
            {"a) this", "b) super", "c) extends", "d) implements"},
            {"a) start()", "b) main()", "c) run()", "d) execute()"},
            {"a) int", "b) float", "c) char", "d) boolean"},
            {"a) Microsoft", "b) Google", "c) Sun Microsystems", "d) Apple"},
            {"a) while", "b) do-while", "c) for", "d) foreach"}
        };

        // Correct answers
        char[] answers = {'c', 'b', 'b', 'c', 'c'};

        int score = 0;

        // Quiz starts
        for (int i = 0; i < questions.length; i++) {

            System.out.println("\n" + questions[i]);

            for (int j = 0; j < options[i].length; j++) {
                System.out.println(options[i][j]);
            }

            System.out.print("Enter your answer (a/b/c/d): ");
            char userAnswer = sc.next().toLowerCase().charAt(0);

            // Switch for answer checking
            switch (userAnswer) {
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                    if (userAnswer == answers[i]) {
                        System.out.println("Correct!");
                        score++;
                    } else {
                        System.out.println("Wrong! Correct answer is: " + answers[i]);
                    }
                    break;

                default:
                    System.out.println("Invalid option! No score awarded.");
            }
        }

        // Final score
        System.out.println("\nQuiz Completed!");
        System.out.println("Your Score: " + score + " / " + questions.length);

        sc.close();
    }
}