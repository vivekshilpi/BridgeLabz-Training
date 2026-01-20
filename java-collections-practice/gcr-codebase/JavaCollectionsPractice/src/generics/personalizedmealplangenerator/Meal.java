package generics.personalizedmealplangenerator;

public class Meal<T extends MealPlan> {

    private T mealPlan;

    Meal(T mealPlan) {
        this.mealPlan = mealPlan;
    }

    public T getMealPlan() {
        return mealPlan;
    }

    public void displayMeal() {
        mealPlan.showMeal();
    }
}
