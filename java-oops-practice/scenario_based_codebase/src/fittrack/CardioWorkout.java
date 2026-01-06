package fittrack;

public class CardioWorkout extends Workout {

    public CardioWorkout(int duration) {
        super("Cardio", duration);
    }

    @Override
    public void calculateCalories(double weight) {
        // calories = duration × weight × factor
        caloriesBurned = (int) (duration * weight * 0.08);
    }
}
