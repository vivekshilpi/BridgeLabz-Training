import java.util.Scanner;

public class ElectionBoothManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int candidate1 = 0;
        int candidate2 = 0;
        int candidate3 = 0;

        while (true) {
            System.out.print("\nEnter age (-1 to exit): ");
            int age = sc.nextInt();

            // Exit condition
            if (age == -1) {
                break;
            }

            // Eligibility check
            if (age >= 18) {
                System.out.println("Eligible to vote.");
                System.out.print("Vote for candidate (1 / 2 / 3): ");
                int vote = sc.nextInt();

                if (vote == 1) {
                    candidate1++;
                } else if (vote == 2) {
                    candidate2++;
                } else if (vote == 3) {
                    candidate3++;
                } else {
                    System.out.println("Invalid vote!");
                }
            } else {
                System.out.println("Not eligible to vote.");
            }
        }

        // Final Result
        System.out.println("\n--- Election Result ---");
        System.out.println("Candidate 1 Votes: " + candidate1);
        System.out.println("Candidate 2 Votes: " + candidate2);
        System.out.println("Candidate 3 Votes: " + candidate3);

        sc.close();
    }
}
