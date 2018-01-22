package fibrecur;

/**
 * @author KLM
 */
public class Fibonacci {
    /**
     * Computes the fibonacci number for <pre>n</pre>
     * Uses a recursive approach.
     *
     * @param n the number of items in the sequence
     * @return the fibonacci number for the nth place in the series
     */
    public static long fibonacci(long n) {
        if (n < 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}