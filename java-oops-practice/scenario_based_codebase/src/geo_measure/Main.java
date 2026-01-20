package geo_measure;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LineService service = new LineService();
        ArrayList<String> results = new ArrayList<>();

        System.out.print("Enter number of line comparisons: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nComparison " + i);

            System.out.println("Enter coordinates for Line 1 (x1 y1 x2 y2): ");
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();

            System.out.println("Enter coordinates for Line 2 (x1 y1 x2 y2): ");
            double x3 = sc.nextDouble();
            double y3 = sc.nextDouble();
            double x4 = sc.nextDouble();
            double y4 = sc.nextDouble();

            // Creating objects using constructor
            Line line1 = new Line(x1, y1, x2, y2);
            Line line2 = new Line(x3, y3, x4, y4);

            // Compare lines using service class
            String result = service.compareLines(line1, line2);
            results.add("Comparison " + i + ": " + result);
        }

        System.out.println("\n===== Final Results =====");
        for (String res : results) {
            System.out.println(res);
        }

        sc.close();
    }
}

