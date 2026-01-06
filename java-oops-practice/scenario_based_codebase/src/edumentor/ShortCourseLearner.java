package edumentor;

public class ShortCourseLearner extends Learner {

    public ShortCourseLearner(String name, String email, int userId, Quiz quiz) {
        super(name, email, userId, quiz);
    }

    @Override
    public void generateCertificate() {
        if (quiz.calculatePercentage() >= 60) {
            System.out.println("Short Course Certificate generated for " + name);
        } else {
            System.out.println("Not eligible for Short Course Certificate");
        }
    }
}
