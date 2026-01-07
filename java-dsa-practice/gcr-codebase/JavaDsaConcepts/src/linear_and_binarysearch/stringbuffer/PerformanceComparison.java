package linear_and_binarysearch.stringbuffer;

import java.io.*;

public class PerformanceComparison {
    public static void main(String[] args) throws IOException {

        int n = 1000000;

        long sbStart = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) sb.append("hello");
        long sbEnd = System.nanoTime();

        long sbufStart = System.nanoTime();
        StringBuffer sbuf = new StringBuffer();
        for (int i = 0; i < n; i++) sbuf.append("hello");
        long sbufEnd = System.nanoTime();

        System.out.println("StringBuilder: " + (sbEnd - sbStart));
        System.out.println("StringBuffer: " + (sbufEnd - sbufStart));

        BufferedReader br = new BufferedReader(new FileReader("large.txt"));
        int words = 0;
        String line;

        long start = System.nanoTime();
        while ((line = br.readLine()) != null) {
            words += line.split("\\s+").length;
        }
        long end = System.nanoTime();

        System.out.println("Word Count: " + words);
        System.out.println("File Read Time: " + (end - start));
        br.close();
    }
}
