import java.util.Scanner;

public class GreatestFactorWhile{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Get integer input
        System.out.print("Enter number: ");
        int number = input.nextInt();

        // Initialize greatestFactor to 1
        int greatestFactor = 1;

        // Initialize counter
        int counter = number - 1;

        // While loop till counter is equal to 1
        while (counter >= 1) {

            // Check if number is perfectly divisible by counter
            if (number % counter == 0) {
                greatestFactor = counter;
                break;
            }

            counter--;
        }

        // Display the greatest factor
        System.out.println(
            "The greatest factor of " + number + " besides itself is: " + greatestFactor
        );

        input.close();
    }
}
