package linear_and_binarysearch.stringbuffer;

import java.util.Scanner;

public class ConcatenateString {
	public static void main(String[] args) {
		// Create scanner object
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array string : ");
		int size = sc.nextInt();
		String[] array = new String[size];
		System.out.println("Enter the strings -> ");
		for(int i=0 ; i<size ; i++) {
			array[i] = sc.next();
		}
		
		
		StringBuffer result = new StringBuffer();
		for(String s : array) {
			result.append(s);
		}
		
		System.out.println(result);
		
		//close scanner object
	}
}
