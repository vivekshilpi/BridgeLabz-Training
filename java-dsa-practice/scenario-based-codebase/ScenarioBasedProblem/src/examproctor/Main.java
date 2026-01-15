package examproctor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ExamProctor exam = new ExamProctor();

        while (true) {
            System.out.println("\n--- Exam Proctor Menu ---");
            System.out.println("1. Visit Question");
            System.out.println("2. Answer Question");
            System.out.println("3. View Last Visited Question");
            System.out.println("4. Submit Exam");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Question ID: ");
                    int qid = sc.nextInt();
                    exam.visitQuestion(qid);
                    break;

                case 2:
                    System.out.print("Enter Question ID: ");
                    int aqid = sc.nextInt();
                    System.out.print("Enter Answer (A/B/C/D): ");
                    String ans = sc.next();
                    exam.answerQuestion(aqid, ans);
                    break;

                case 3:
                    exam.lastVisitedQuestion();
                    break;

                case 4:
                    exam.submitExam();
                    sc.close();
                    return;

                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
