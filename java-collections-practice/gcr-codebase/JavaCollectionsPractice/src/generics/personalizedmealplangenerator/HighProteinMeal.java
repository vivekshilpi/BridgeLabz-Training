package generics.personalizedmealplangenerator;

public class HighProteinMeal implements MealPlan {

    public String getMealType() {
        return "High Protein";
    }

    public void showMeal() {
        System.out.println("High Protein Meal: Chicken, Lentils, Paneer");
    }
}
