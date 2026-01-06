package edumentor;

import java.util.Scanner;

public class Quiz {

    // ================= EASY =================
    private static final String[] EASY_Q = {
            "What is Java?",
            "What is a class?",
            "What is an object?",
            "What is JVM?"
    };

    private static final String[][] EASY_OPT = {
            {"Programming Language", "Database", "OS", "Browser"},
            {"Object", "Blueprint", "Method", "Variable"},
            {"Class", "Blueprint", "Instance", "Package"},
            {"Compiler", "Interpreter", "Virtual Machine", "Hardware"}
    };

    private static final int[] EASY_ANS = {1, 2, 3, 3};

    // ================= MEDIUM =================
    private static final String[] MEDIUM_Q = {
            "What is inheritance?",
            "What is polymorphism?",
            "What is encapsulation?",
            "Which keyword is used for abstraction?"
    };

    private static final String[][] MEDIUM_OPT = {
            {"Code duplication", "Reuse of code", "Memory allocation", "Compilation"},
            {"Many forms", "Single form", "Data hiding", "Overloading"},
            {"Data hiding", "Multiple inheritance", "Code reuse", "Object creation"},
            {"class", "this", "abstract", "static"}
    };

    private static final int[] MEDIUM_ANS = {2, 1, 1, 3};

    // ================= HARD =================
    private static final String[] HARD_Q = {
            "Which memory is shared among threads?",
            "Which collection is thread-safe?",
            "Which GC algorithm is low-latency?",
            "Which keyword prevents inheritance?"
    };

    private static final String[][] HARD_OPT = {
            {"Stack", "Heap", "Register", "Cache"},
            {"HashMap", "ArrayList", "ConcurrentHashMap", "LinkedList"},
            {"Serial GC", "Parallel GC", "ZGC", "Mark-Sweep"},
            {"static", "final", "private", "protected"}
    };

    private static final int[] HARD_ANS = {2, 3, 3, 2};

    // ================= COMMON =================
    private int score = 0;
    private int totalMarks;

    public void conductQuiz(String level, Scanner sc) {

        score = 0;

        String[] questions;
        String[][] options;
        int[] answers;

        switch (level.toLowerCase()) {
            case "easy":
                questions = EASY_Q;
                options = EASY_OPT;
                answers = EASY_ANS;
                break;

            case "medium":
                questions = MEDIUM_Q;
                options = MEDIUM_OPT;
                answers = MEDIUM_ANS;
                break;

            case "hard":
                questions = HARD_Q;
                options = HARD_OPT;
                answers = HARD_ANS;
                break;

            default:
                System.out.println("Invalid difficulty level.");
                return;
        }

        totalMarks = questions.length;

        for (int i = 0; i < questions.length; i++) {

            System.out.println("\nQ" + (i + 1) + ": " + questions[i]);

            for (int j = 0; j < 4; j++) {
                System.out.println((j + 1) + ". " + options[i][j]);
            }

            System.out.print("Choose option (1-4): ");
            int choice = sc.nextInt();

            if (choice == answers[i]) {
                score++;
            }
        }
    }

    public double calculatePercentage() {
        return (score * 100.0) / totalMarks;
    }

    public int getScore() {
        return score;
    }
}
