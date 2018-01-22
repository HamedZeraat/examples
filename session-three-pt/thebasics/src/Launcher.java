/**
 * @Author KLM
 * <p>
 * This is the main program that runs various versions of fibonacci.
 */

import static fibmemo.Fibonacci.fibonacci;

public class Launcher {
    /**
     * @param args command line arguments
     */

    // the number of items in the series
    private final static long NUMBER = 30L;

    public static void main(String[] args) {
//        assert fibonacci(0) == 1;
//        assert fibonacci(1) == 1;
//        assert fibonacci(2) == 2;
//        assert fibonacci(3) == 3;
//        //assert fibonacci(4) == 12;
//        assert fibonacci(5) == 8;

        long startTime = System.currentTimeMillis();
        System.out.println("The value of the " + NUMBER + "th number of the fibonacci sequence is "
                + fibonacci(NUMBER));
        long stopTime = System.currentTimeMillis();
        System.out.println("Time taken for the computation in milliseconds "
                + (stopTime - startTime));
    }
}
