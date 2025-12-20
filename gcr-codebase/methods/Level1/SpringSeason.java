//importing the Scanner class for taking user inputs
import java.util.Scanner;
public class SpringSeason{
	static boolean isSpring(int month, int day){
		// checking spring season
		if(month==3 && day>=20 || month==4 || month==5 || month==6 && day<=20){
			return true;
		}
		else{
			return false;
		}
	}
	public static void main(String[]args){
		// Taking input from command line
		int month = Integer.parseInt(args[0]);	
		int day = Integer.parseInt(args[1]);
		
        // calling function and storing result
		boolean result = isSpring(month, day);
		if(result){
			System.out.println("Its a Spring Season");
		}
		else{
			System.out.println("Not a Spring Season");
		}
	}	
}