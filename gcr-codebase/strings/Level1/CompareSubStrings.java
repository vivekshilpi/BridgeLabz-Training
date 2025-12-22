import java.util.Scanner;
public class CompareSubStrings {
	
	//method to return substring of a string
	public static String findSubstring(String str1, int startIndex, int endIndex){
	
		//initialize a string to store substtring
		String subString = "";
		
		//use for loop to iterate over the string
		for(int i = startIndex;  i < endIndex; i++){
			subString += str1.charAt(i);
		}
		return subString;
	}
	public static void main(String[] args){
	
		//create an instance of scanner class
		Scanner input = new Scanner(System.in);
		
		//get first string input from user
		System.out.println("Enter first string: ");
		String str = input.next().trim();
		
		//get starting index input from user
		System.out.println("Enter starting index: ");
		int startIndex = input.nextInt();
		
		//get ending index input from user
		System.out.println("Enter ending index: ");
		int endIndex = input.nextInt();
		
		//initialize a variable to store the resultant subString from method
		String str1 = findSubstring(str, startIndex, endIndex);
		
		//initialize a boolean variable to store result from built-in method
		String str2 = str.substring(startIndex, endIndex);
		
		//initialize a boolean variable to store result
		boolean compareResult = str1.equals(str2);
		
		//print the substring
		System.out.println("Your substring is "+ str1);
		if(compareResult){
			System.out.println("Both substrings are equal");
		}
		else{
			System.out.println("Both substrings are not equal");
		}
	}
}