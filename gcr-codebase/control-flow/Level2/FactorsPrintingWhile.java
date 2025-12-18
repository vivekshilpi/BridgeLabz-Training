import java.util.Scanner;

public class FactorsPrintingWhile {
    public static void main(String[] args) {

        // Declaring a Scanner class
        Scanner input = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Initializing loop variable
        int i = 1;

        // While loop to find and print factors
        while (i <= number) {
            // Check if the number is perfectly divisible by i
            if (number % i == 0) {
                System.out.println(i);
            }
            i++;
        }

        // Closing scanner
        input.close();
    }
}
