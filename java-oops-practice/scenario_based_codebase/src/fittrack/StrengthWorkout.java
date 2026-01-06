package fittrack;

public class StrengthWorkout extends Workout {

    public StrengthWorkout(int duration) {
        super("Strength", duration);
    }

    @Override
    public void calculateCalories(double weight) {
        caloriesBurned = (int) (duration * weight * 0.06);
    }
}
