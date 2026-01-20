package generics.resumescreeningsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ResumeScreeningSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<JobRole> screeningPipeline = new ArrayList<>();

        while (true) {

            System.out.println("\n--- AI Resume Screening System ---");
            System.out.println("1. Add Software Engineer Resume");
            System.out.println("2. Add Data Scientist Resume");
            System.out.println("3. Add Product Manager Resume");
            System.out.println("4. Process All Resumes");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Candidate name: ");
                    screeningPipeline.add(
                        new SoftwareEngineer(sc.nextLine())
                    );
                    break;

                case 2:
                    System.out.print("Candidate name: ");
                    screeningPipeline.add(
                        new DataScientist(sc.nextLine())
                    );
                    break;

                case 3:
                    System.out.print("Candidate name: ");
                    screeningPipeline.add(
                        new ProductManager(sc.nextLine())
                    );
                    break;

                case 4:
                    ResumeUtil.bulkProcess(screeningPipeline);
                    break;

                case 5:
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
