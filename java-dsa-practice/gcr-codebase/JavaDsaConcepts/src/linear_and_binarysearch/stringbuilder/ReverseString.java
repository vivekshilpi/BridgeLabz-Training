package linear_and_binarysearch.stringbuilder;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		// Create scanner object
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String s = sc.next();
		
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		// inbuilt reverse method
		sb.reverse();
		System.out.println("Reversed String -> " + sb.toString());
		// Close the scanner stream
		sc.close();
	}
}
