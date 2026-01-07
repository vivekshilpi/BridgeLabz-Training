package linear_and_binarysearch.stringbuilder;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicates {
	public static void main(String[] args) {
		// Create scanner object
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String s = sc.next();
		
		StringBuilder result = new StringBuilder();
		HashSet<Character> set = new HashSet<>();
		
		// Converting string to character array
		char[] ch = s.toCharArray();
		
		for(char c : ch) {
			if(!set.contains(c)) {
				result.append(c);	
				set.add(c);
			}
		}
		
		System.out.println("Resulted string -> " + result.toString());
		
		//Close scanner stream
		sc.close();
	}
}
