package linear_and_binarysearch.filereader;

import java.io.*;

public class WordCount {
    public static void main(String[] args) throws IOException {

        String target = "java";
        int count = 0;

        BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
        String line;

        while ((line = br.readLine()) != null) {
            String[] words = line.split("\\s+");
            for (String word : words) {
                if (word.equalsIgnoreCase(target)) {
                    count++;
                }
            }
        }

        System.out.println("Occurrences of '" + target + "': " + count);
        br.close();
    }
}
