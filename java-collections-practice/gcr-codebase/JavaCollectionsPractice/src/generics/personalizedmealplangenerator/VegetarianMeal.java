package generics.personalizedmealplangenerator;

public class VegetarianMeal implements MealPlan {

    public String getMealType() {
        return "Vegetarian";
    }

    public void showMeal() {
        System.out.println("Vegetarian Meal: Rice, Dal, Vegetables");
    }
}
