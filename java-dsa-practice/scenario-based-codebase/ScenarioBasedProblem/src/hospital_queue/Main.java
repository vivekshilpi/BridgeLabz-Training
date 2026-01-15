package hospital_queue;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of ER patients: ");
        int n = sc.nextInt();

        Patient[] queue = new Patient[n];

        for(int i = 0; i < n; i++) {
            System.out.print("Enter Patient no. "+ (i+1) +" Name: ");
            String name = sc.next();

            System.out.print("Enter Criticality (1–10): ");
            int criticality = sc.nextInt();

            queue[i] = new Patient(name, criticality);
        }

        System.out.println("\n--- BEFORE SORTING ---");
        for(Patient p : queue) p.display();

        HospitalQueue.sortByCriticality(queue);

        System.out.println("\n--- AFTER SORTING (High Priority First) ---");
        for(Patient p : queue) p.display();
    }
}
