package fibiter;

/**
 * @author KLM
 */
public class Fibonacci {
    /**
     * Computes the fibonacci number for <pre>n</pre>
     * @param n the number of items in the sequence
     * @return the fibonacci number for the nth place in the series
     */
    public static long fibonacci(long n) {
        long n1 = 0L;
        long n2 = 1L;

        for(long i=2; i < n+1; i++){
            long temp = n2;
            n2 = n1 + temp;
            n1 = temp;
        }
        return n2;
    }
}