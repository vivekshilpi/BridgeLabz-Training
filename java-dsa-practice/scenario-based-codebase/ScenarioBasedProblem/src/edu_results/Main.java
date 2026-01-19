package edu_results;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of districts: ");
        int districts = sc.nextInt();

        List<Student> allStudents = new ArrayList<>();

        for (int d = 1; d <= districts; d++) {
            System.out.println("\nDistrict " + d + ":");

            System.out.print("Enter number of students: ");
            int n = sc.nextInt();

            System.out.println("Enter students in SORTED order of marks (descending):");

            for (int i = 0; i < n; i++) {
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                sc.nextLine(); // buffer clear

                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Marks: ");
                int marks = sc.nextInt();

                allStudents.add(new Student(id, name, marks));
            }
        }

        // Apply Merge Sort
        List<Student> finalRankList = MergeSort.mergeSort(allStudents);

        System.out.println("\n=== FINAL STATE-WISE RANK LIST ===");
        for (Student s : finalRankList) {
            System.out.println(s);
        }

        sc.close();
    }
}
