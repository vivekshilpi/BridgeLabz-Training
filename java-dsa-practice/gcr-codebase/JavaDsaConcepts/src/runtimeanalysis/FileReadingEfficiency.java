package runtimeanalysis;

import java.io.*;

public class FileReadingEfficiency {

    private static final String FILE_PATH = "/Users/vivekshilpi/BridgeLabz-Training/java-dsa-practice/gcr-codebase/JavaDsaConcepts/src/runtimeanalysis/FilereadSample.txt";
    // FileReader
    public static void readUsingFileReader() throws IOException {
        FileReader reader = new FileReader(FILE_PATH);
        while (reader.read() != -1) {
        }
        reader.close();
    }

    // InputStreamReader 
    public static void readUsingInputStreamReader() throws IOException {
        InputStreamReader reader =
                new InputStreamReader(new FileInputStream(FILE_PATH));
        while (reader.read() != -1) {
            // reading bytes and converting to characters
        }
        reader.close();
    }

    public static void main(String[] args) {

        try {
            // FileReader Time
            long startFileReader = System.nanoTime();
            readUsingFileReader();
            long endFileReader = System.nanoTime();

            //  InputStreamReader Time 
            long startInputStreamReader = System.nanoTime();
            readUsingInputStreamReader();
            long endInputStreamReader = System.nanoTime();

            System.out.println("File Reading Performance Comparison");

            System.out.println("FileReader Time: " +
                    (endFileReader - startFileReader) / 1000000.0 + " ms");

            System.out.println("InputStreamReader Time: " +
                    (endInputStreamReader - startInputStreamReader) / 1000000.0 + " ms");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}