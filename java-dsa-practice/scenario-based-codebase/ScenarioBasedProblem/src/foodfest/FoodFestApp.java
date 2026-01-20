package sorting.foodfest;

import java.util.Scanner;

public class FoodFestApp {
	
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of stalls:");
        int n = sc.nextInt();
        sc.nextLine();

        Stall[] stallList = new Stall[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter Stall name :");
            String name = sc.nextLine();

            System.out.println("Enter FootFall : ");
            int count = sc.nextInt();
            sc.nextLine();

            stallList[i] = new Stall(name, count);
        }

        // Merge Sort call
        StallSorting.mergeSort(stallList, 0, n - 1);

        System.out.println("Students sorted by score");
        StallSorting.display(stallList);

        sc.close();
    }

}
