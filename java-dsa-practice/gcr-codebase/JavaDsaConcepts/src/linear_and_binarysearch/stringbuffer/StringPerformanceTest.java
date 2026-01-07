package linear_and_binarysearch.stringbuffer;

public class StringPerformanceTest {
    public static void main(String[] args) {

        int count = 1000000;

        // StringBuffer
        long startBuffer = System.nanoTime();
        StringBuffer sbuffer = new StringBuffer();
        for (int i = 0; i < count; i++) {
            sbuffer.append("hello");
        }
        long endBuffer = System.nanoTime();

        // StringBuilder
        long startBuilder = System.nanoTime();
        StringBuilder sbuilder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sbuilder.append("hello");
        }
        long endBuilder = System.nanoTime();

        System.out.println("StringBuffer Time: " + (endBuffer - startBuffer) + " ns");
        System.out.println("StringBuilder Time: " + (endBuilder - startBuilder) + " ns");
    }
}

