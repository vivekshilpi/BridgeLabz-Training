//importing the Scanner class for taking user inputs
import java.util.Scanner;
public class CheckNumber {
	static int checkNumber(int number){
		//checking if the number is greater than zero than it is positive
		if( number > 0){
		    return 1;
		}
		//checking if the number is lesser than zero than it is negative
		else if(number < 0){
		    return -1;
		}
		//if the number is not positive nor negative than it should be zero
		else{
		    return 0;
		}
	}
	public static void main(String[]args){
            
		//Create an instance of Scanner class to take user inputs
		Scanner input = new Scanner(System.in);
			
		//Create a int variable named number and take input from user
		System.out.println("Enter number: ");
		int number = input.nextInt();	
				
        // function call
        int result = checkNumber(number);

        System.out.println(result);
		
	    //Closing the scanner object
	    input.close();
	}
}