import java.util.Scanner;
public class CheckAnagram {
    // method to check the string are anagrams or not
    public static boolean checkAnagram(String string1, String string2) {
        // check length of both strings, if not same, not anagram
        if(string1.length()!=string2.length()) return false;
        // create arrays to store frequencies of each char in both strings
        int[] freq1 = new int[256];
        int[] freq2 = new int[256];

        for(int i=0;i<string1.length();i++){
            freq1[string1.charAt(i)]++;
            freq2[string2.charAt(i)]++;
        }

        // check wheather frequency is same
        for(int i=0;i<string1.length();i++){
            if(freq1[i]!=freq2[i]) return false;
        }
        return true;
        
    }

    public static void main(String[] args) {
        // creating the instance of scanner class
        Scanner input = new Scanner(System.in);
        // taking input from user
        System.out.println("Enter First string : ");
        String string1 = input.next();
        System.out.println("Enter Second string : ");
        String string2 = input.next();
        boolean anagram = checkAnagram(string1, string2);
        if (anagram) {
            System.out.println("yes, the given two strings are anagram ");
        } else {
            System.out.println("No,the given two strings are not anagram ");
        }
        //closing the input stream
        input.close();
    }
}