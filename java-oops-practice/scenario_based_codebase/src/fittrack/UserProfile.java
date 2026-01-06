package fittrack;

public class UserProfile {

    private String name;
    private int age;
    private double weight;          // protected health data
    private int dailyCalorieGoal;

    // Default goal constructor
    public UserProfile(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.dailyCalorieGoal = 2000; // default goal
    }

    // Custom goal constructor
    public UserProfile(String name, int age, double weight, int dailyCalorieGoal) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.dailyCalorieGoal = dailyCalorieGoal;
    }

    // Encapsulation: no direct access to weight
    public double getWeight() {
        return weight;
    }

    public int getDailyCalorieGoal() {
        return dailyCalorieGoal;
    }

    // Operator usage
    public int calculateRemainingCalories(int caloriesBurned) {
        return dailyCalorieGoal - caloriesBurned;
    }
}
