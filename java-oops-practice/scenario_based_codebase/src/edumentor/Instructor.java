package edumentor;

public class Instructor extends User {

    public Instructor(String name, String email, int userId) {
        super(name, email, userId);
    }

    public void createQuiz() {
        System.out.println("Instructor created a quiz.");
    }
}
