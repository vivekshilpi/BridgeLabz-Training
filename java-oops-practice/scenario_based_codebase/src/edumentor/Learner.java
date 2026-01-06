package edumentor;

public abstract class Learner extends User implements ICertifiable {

    protected Quiz quiz;

    public Learner(String name, String email, int userId, Quiz quiz) {
        super(name, email, userId);
        this.quiz = quiz;
    }
}
