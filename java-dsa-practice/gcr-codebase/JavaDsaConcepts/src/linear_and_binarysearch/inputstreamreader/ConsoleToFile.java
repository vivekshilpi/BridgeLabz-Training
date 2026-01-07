package linear_and_binarysearch.inputstreamreader;

import java.io.*;

public class ConsoleToFile {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileWriter fw = new FileWriter("output.txt");

        String input;
        System.out.println("Enter text (type 'exit' to stop):");

        while (!(input = br.readLine()).equalsIgnoreCase("exit")) {
            fw.write(input + "\n");
        }

        fw.close();
        br.close();
        System.out.println("Data saved to file.");
    }
}
