import java.util.Scanner;

public class RajResultGenerator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        int total = 0;
        double average;
        char grade;

        System.out.println("Raj's Result Generator");

        // Taking 5 subject marks using for-loop
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks of Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        average = total / 5.0;

        System.out.println("\nTotal Marks: " + total);
        System.out.println("Average Marks: " + average);

        // Switch case for Grade Assignment
        switch ((int) average / 10) {
            case 10:
            case 9:
                grade = 'A';   // A+
                System.out.println("Grade: A+");
                break;
            case 8:
                grade = 'A';
                System.out.println("Grade: A");
                break;
            case 7:
                grade = 'B';
                System.out.println("Grade: B");
                break;
            case 6:
                grade = 'C';
                System.out.println("Grade: C");
                break;
            case 5:
                grade = 'D';
                System.out.println("Grade: D");
                break;
            default:
                grade = 'F';
                System.out.println("Grade: F (Fail)");
        }

        sc.close();
    }
}
