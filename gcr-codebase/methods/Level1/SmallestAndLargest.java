import jav
public class SmallestAndLargest {
	public static void findSmallestAndLargest(int number1, int number2, int number3){
		int smallest = Math.min(number1, number2, number3), largest = Math.min(number1, number2, number3);
		System.out.println("The smallest no. is : "+smallest+ " and largest no. is : "+largest);
	}

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number 1 : ");
		int number1 = sc.nextInt();
		System.out.println("Enter number 2 : ");
		int number2 = sc.nextInt();
		System.out.println("Enter number 3 : ");
		int number3 = sc.nextInt();

		findSmallestAndLargest(number1, number2, number3);

		input.close();
	}
}