package examcell;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of test centers: ");
        int centers = sc.nextInt();

        Student[] globalList = new Student[0];

        for (int c = 1; c <= centers; c++) {

            System.out.println("\n--- Center " + c + " ---");
            System.out.print("Enter number of students in this center: ");
            int n = sc.nextInt();

            Student[] centerList = new Student[n];

            for (int i = 0; i < n; i++) {
                System.out.print("Enter Roll No: ");
                int roll = sc.nextInt();

                System.out.print("Enter Name: ");
                String name = sc.next();

                System.out.print("Enter Score: ");
                double score = sc.nextDouble();

                centerList[i] = new Student(roll, name, score);
            }

            // Assume each center is already sorted by score (real exam workflow)
            globalList = ExamCellSorter.mergeTwoCenters(globalList, centerList);
        }

        // Final global sorting for safety and consistency
        ExamCellSorter.mergeSort(globalList, 0, globalList.length - 1);

        System.out.println("\n=== STATE-LEVEL RANK LIST ===");
        for (int i = 0; i < globalList.length; i++) {
            System.out.print("Rank " + (i + 1) + " : ");
            globalList[i].display();
        }
    }
}

