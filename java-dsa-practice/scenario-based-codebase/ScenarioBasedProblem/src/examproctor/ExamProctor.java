package examproctor;

import java.util.*;

public class ExamProctor {

    private Stack<Integer> navigationStack = new Stack<>();
    private HashMap<Integer, String> studentAnswers = new HashMap<>();
    private HashMap<Integer, String> correctAnswers = new HashMap<>();

    // Load correct answers
    public ExamProctor() {
        correctAnswers.put(1, "A");
        correctAnswers.put(2, "B");
        correctAnswers.put(3, "C");
        correctAnswers.put(4, "D");
    }

    // Track navigation
    public void visitQuestion(int questionId) {
        navigationStack.push(questionId);
        System.out.println("Visited Question: " + questionId);
    }

    // Store answer
    public void answerQuestion(int questionId, String answer) {
        studentAnswers.put(questionId, answer);
        System.out.println("Answer saved for Question " + questionId);
    }

    // View last visited question
    public void lastVisitedQuestion() {
        if (navigationStack.isEmpty()) {
            System.out.println("No questions visited yet.");
        } else {
            System.out.println("Last visited question: " + navigationStack.peek());
        }
    }

    // Auto-calculate score
    public int calculateScore() {
        int score = 0;

        for (int qid : correctAnswers.keySet()) {
            if (studentAnswers.containsKey(qid) &&
                studentAnswers.get(qid).equalsIgnoreCase(correctAnswers.get(qid))) {
                score++;
            }
        }
        return score;
    }

    // Submit exam
    public void submitExam() {
        int score = calculateScore();
        System.out.println("Exam Submitted!");
        System.out.println("Final Score: " + score + "/" + correctAnswers.size());
    }
}
