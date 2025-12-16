// including Scanner class for user input
import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base: ");
        double base = sc.nextDouble(); // read base

        System.out.print("Enter exponent: ");
        double exponent = sc.nextDouble(); // read exponent

        double result = Math.pow(base, exponent); // calculate result

        System.out.println("Result: " + result); // print result

        sc.close();
    }
}
