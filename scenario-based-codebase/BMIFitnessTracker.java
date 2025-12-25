/*

* Write a Java program that takes height and weight as input,
* calculates BMI using the formula BMI = weight / (height * height), 
* and prints the BMI category as Underweight, Normal, or Overweight using if-else conditions. 

*/
import java.util.Scanner;

public class BMIFitnessTracker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input height in meters
        System.out.print("Enter height in meters: ");
        double height = sc.nextDouble();

        // Input weight in kilograms
        System.out.print("Enter weight in kilograms: ");
        double weight = sc.nextDouble();

        // BMI calculation formula
        double bmi = weight / (height * height);

        System.out.println("\nYour BMI is: " + bmi);

        // Determine BMI category using if-else
        if (bmi < 18.5) {
            System.out.println("Category: Underweight");
        } 
        else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Category: Normal");
        } 
        else {
            System.out.println("Category: Overweight");
        }

        sc.close();
    }
}
