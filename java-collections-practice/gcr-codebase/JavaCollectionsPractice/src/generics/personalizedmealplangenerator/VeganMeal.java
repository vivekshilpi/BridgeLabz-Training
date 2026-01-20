package generics.personalizedmealplangenerator;

public class VeganMeal implements MealPlan {

    public String getMealType() {
        return "Vegan";
    }

    public void showMeal() {
        System.out.println("Vegan Meal: Quinoa, Beans, Salad");
    }
}
