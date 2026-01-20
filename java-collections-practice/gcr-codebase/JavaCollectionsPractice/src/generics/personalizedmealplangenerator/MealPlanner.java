package generics.personalizedmealplangenerator;

import java.util.Scanner;

public class MealPlanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n--- Personalized Meal Plan Generator ---");
            System.out.println("1. Vegetarian Meal");
            System.out.println("2. Vegan Meal");
            System.out.println("3. Keto Meal");
            System.out.println("4. High Protein Meal");
            System.out.println("5. Exit");

            System.out.print("Choose meal type: ");
            int choice = sc.nextInt();
            if(choice==5) {
            	System.out.println("Thank you!");
            	break;
            }

            Meal<?> meal = null;

            switch (choice) {

                case 1:
                    meal = MealGenerator.generateMeal(new VegetarianMeal());
                    break;

                case 2:
                    meal = MealGenerator.generateMeal(new VeganMeal());
                    break;

                case 3:
                    meal = MealGenerator.generateMeal(new KetoMeal());
                    break;

                case 4:
                    meal = MealGenerator.generateMeal(new HighProteinMeal());
                    break;

                case 5:
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
                    continue;
            }

            meal.displayMeal();
        }
        sc.close();
    }
}
