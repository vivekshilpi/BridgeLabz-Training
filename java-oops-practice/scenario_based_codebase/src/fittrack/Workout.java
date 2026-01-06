package fittrack;

public abstract class Workout implements ITrackable {

    protected String type;
    protected int duration;           // minutes
    protected int caloriesBurned;
    private boolean isActive;          // internal log (restricted)

    public Workout(String type, int duration) {
        this.type = type;
        this.duration = duration;
    }

    @Override
    public void startWorkout() {
        isActive = true;
        System.out.println(type + " workout started");
    }

    @Override
    public void stopWorkout() {
        isActive = false;
        System.out.println(type + " workout stopped");
    }

    // Polymorphism
    public abstract void calculateCalories(double weight);

    public int getCaloriesBurned() {
        return caloriesBurned;
    }
}
