package generics.personalizedmealplangenerator;

public class MealGenerator {

    public static <T extends MealPlan> Meal<T> generateMeal(T mealPlan) {
        System.out.println("Generating " + mealPlan.getMealType() + " meal plan...");
        return new Meal<>(mealPlan);
    }
}
