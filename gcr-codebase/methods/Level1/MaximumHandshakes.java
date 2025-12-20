//including scanner package to take input
import java.util.Scanner;
public class MaximumHandshakes {
	// function to count handshakes
	static void countHandshakes(int numberOfStudents){
		//calculating number of hanshakes among student
		int numberOfHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
		
		//printing the number of handshakes
		System.out.println("Total number of handshakes among "+ numberOfStudents + " is " + numberOfHandshakes);
	}
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		//Taking number of student as input
		System.out.println("Enter number of students: ");
		int numberOfStudents = input.nextInt();
        
        // function call
		countHandshakes(numberOfStudents);
		
		input.close();
		
	}
}