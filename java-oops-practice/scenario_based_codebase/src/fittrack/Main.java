package fittrack;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter weight (kg): ");
        double weight = sc.nextDouble();

        System.out.print("Do you want custom calorie goal? (yes/no): ");
        sc.nextLine();
        String choice = sc.nextLine();

        UserProfile user;

        if (choice.equalsIgnoreCase("yes")) {
            System.out.print("Enter daily calorie goal: ");
            int goal = sc.nextInt();
            user = new UserProfile(name, age, weight, goal);
        } else {
            user = new UserProfile(name, age, weight);
        }

        System.out.print("Choose workout (cardio / strength): ");
        sc.nextLine();
        String workoutType = sc.nextLine();

        System.out.print("Enter duration (minutes): ");
        int duration = sc.nextInt();

        Workout workout;

        if (workoutType.equalsIgnoreCase("cardio")) {
            workout = new CardioWorkout(duration);
        } else {
            workout = new StrengthWorkout(duration);
        }

        workout.startWorkout();
        workout.calculateCalories(user.getWeight());
        workout.stopWorkout();

        int burned = workout.getCaloriesBurned();
        int remaining = user.calculateRemainingCalories(burned);

        System.out.println("\nCalories Burned: " + burned);
        System.out.println("Remaining Calories for Today: " + remaining);

        sc.close();
    }
}
