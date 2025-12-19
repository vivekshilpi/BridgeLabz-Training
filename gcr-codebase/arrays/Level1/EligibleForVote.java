import java.util.Scanner;
public class EligibleForVote{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		// Create an array age of size 10
        int[] age = new int[10];
        // Taking input from user 
		for(int i=0;i<age.length; i++){
			age[i]= input.nextInt();
		}
        
        // Checking Eligibility for vote 
		for(int i=0;i<age.length; i++){
			if(age[i]<0){
                System.out.println("Invalid Age");
			}
			else if(age[i]>=18){
				System.out.println("The student with the age " + age[i] + " can vote.");
			}
			else{
				System.out.println("The student with the age " + age[i] + " cannot vote.");
			}
		}
		
		input.close();

	}
}