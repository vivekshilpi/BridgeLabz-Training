package edumentor;

public class FullTimeLearner extends Learner {

    public FullTimeLearner(String name, String email, int userId, Quiz quiz) {
        super(name, email, userId, quiz);
    }

    @Override
    public void generateCertificate() {
        if (quiz.calculatePercentage() >= 75) {
            System.out.println("Full-Time Course Certificate generated for " + name);
        } else {
            System.out.println("Not eligible for Full-Time Certificate");
        }
    }
}
