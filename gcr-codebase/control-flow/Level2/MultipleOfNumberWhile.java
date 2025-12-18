import java.util.Scanner;

public class MultipleOfNumberWhile{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if number is positive and less than 100
        if (number <= 0 || number >= 100) {
            System.out.println("Please enter a positive number less than 100.");
        } else {

            System.out.println("Multiples of " + number + " below 100 are:");

            // Counter starts from 99 (below 100)
            int counter = 99;

            // While loop till counter > 1
            while (counter > 1) {

                // Check if counter is a multiple of number
                if (counter % number == 0) {
                    System.out.println(counter);
                }

                counter--;
            }
        }

        input.close();
    }
}
