import java.util.Scanner;

public class CalculatePowerWhile{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Get integer input for number
        System.out.print("Enter the base number: ");
        int number = input.nextInt();

        // Get integer input for power
        System.out.print("Enter the power: ");
        int power = input.nextInt();

        // Initialize result to 1
        int result = 1;

        // Initialize counter to 0
        int counter = 0;

        // While loop till counter == power
        while (counter < power) {
            result = result * number;
            counter++;
        }

        // Print the result
        System.out.println("Power " + power + " of " + number + " is " + result);

        input.close();
    }
}
