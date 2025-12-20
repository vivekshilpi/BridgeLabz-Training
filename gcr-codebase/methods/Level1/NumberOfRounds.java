import java.util.Scanner;
public class NumberOfRounds {
    static void findRounds(int side1, int side2, int side3, int distance){
        int perimeter = (side1 + side2 + side3) ;
        int totalRounds = distance/perimeter;

        System.out.println("The number of rounds user needs to do to complete 5km run is : " + totalRounds);
    
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter side 1 : ");
        int side1 = input.nextInt();
        System.out.println("enter side 2 : ");
        int side2 = input.nextInt();
        System.out.println("enter side 3 : ");
        int side3 = input.nextInt();

        int distance = 5000;
        
        NumberOfRounds(side1, side2, side3, distance);

        input.close();
    }
}