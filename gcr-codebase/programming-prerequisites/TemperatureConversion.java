import java.util.*;

public class TemperatureConversion{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Temperature in Celsius : ");
		int celsius = sc.nextInt();
		int Fahrenheit = (celsius * 9/5) + 32;
		System.out.println("In Fahrenheit: "+ Fahrenheit);
	}
}