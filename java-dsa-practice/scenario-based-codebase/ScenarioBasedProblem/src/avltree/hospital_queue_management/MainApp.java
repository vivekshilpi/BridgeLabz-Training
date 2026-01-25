package avltree.hospital_queue_management;

import java.util.Scanner;

public class MainApp
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        HospitalAVL hospital = new HospitalAVL();

        while (true)
        {
            System.out.println("\nHospital Queue System");
            System.out.println("1. Register Patient");
            System.out.println("2. Discharge Patient");
            System.out.println("3. Display by Arrival Time");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int ch = sc.nextInt();

            switch (ch)
            {
                case 1:
                    System.out.print("Enter Check-in Time: ");
                    int time = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Patient Name: ");
                    String name = sc.nextLine();
                    hospital.root = hospital.insert(hospital.root, time, name);
                    System.out.println("Patient registered");
                    break;

                case 2:
                    System.out.print("Enter Check-in Time to remove: ");
                    int t = sc.nextInt();
                    hospital.root = hospital.delete(hospital.root, t);
                    System.out.println("Patient removed");
                    break;

                case 3:
                    System.out.println("Patients by arrival time:");
                    hospital.display(hospital.root);
                    break;

                case 4:
                    System.exit(0);

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
