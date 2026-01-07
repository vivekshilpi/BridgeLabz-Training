package linear_and_binarysearch.linearsearch;

import java.util.Scanner;

public class SentenceSearch {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of sentences: ");
        int n = Integer.parseInt(sc.nextLine());

        String[] sentences = new String[n];

        System.out.println("Enter sentences:");
        for (int i = 0; i < n; i++) {
            sentences[i] = sc.nextLine();
        }

        System.out.print("Enter word to search: ");
        String word = sc.nextLine();

        boolean found = false;

        for (String sentence : sentences) {
            if (sentence.contains(word)) {
                System.out.println("Word found in sentence:");
                System.out.println(sentence);
                found = true;
                break;
            }
        }

        if (!found)
            System.out.println("Not Found");

        sc.close();
    }
}
