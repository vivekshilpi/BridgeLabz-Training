package linear_and_binarysearch.binarysearch;

import java.util.Scanner;

public class Search2DMatrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = sc.nextInt();

        System.out.print("Enter target element: ");
        int target = sc.nextInt();

        int left = 0, right = rows * cols - 1;
        boolean found = false;

        while (left <= right) {
            int mid = (left + right) / 2;
            int value = matrix[mid / cols][mid % cols];

            if (value == target) {
                found = true;
                break;
            } else if (value < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        System.out.println(found ? "Element Found" : "Element Not Found");

        sc.close();
    }
}
