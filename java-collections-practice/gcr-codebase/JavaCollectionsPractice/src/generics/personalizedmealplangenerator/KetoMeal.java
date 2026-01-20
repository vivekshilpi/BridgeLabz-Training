package generics.personalizedmealplangenerator;

public class KetoMeal implements MealPlan {

    public String getMealType() {
        return "Keto";
    }

    public void showMeal() {
        System.out.println("Keto Meal: Eggs, Cheese, Avocado");
    }
}
