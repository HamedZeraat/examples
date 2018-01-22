package fibmemo;

/**
 * @author KLM
 */
public class Fibonacci {
    // array to store intermediate results
    private static long[] fibArray;
//    static String s = new String("asdasd");
//    static String s1 = "asdasd";

    /**
     * Computes the fibonacci number for <pre>n</pre>
     * Uses a recursive approach and memoization.
     *
     * @param n the number of items in the sequence
     * @return the fibonacci number for the nth place in the series
     */
    public static long fibonacci(long n) {
        fibArray = new long[(int) (n + 1)];
        fibArray[0] = 1;
        fibArray[1] = 1;
        long temp = fibHelper(n);

//        for(int i=0; i < fibArray.length; i++)
//        int i = 0;
//        while (i < fibArray.length){
//            // ....
//            i++;
//        }
//        for (long x: fibArray){
//            System.out.println("Value = " + x);
//        }
        return temp;
    }

    private static long fibHelper(long n) {
        long fibValue = 0;
        int index = (int) n;

        if (fibArray[index] != 0) {
            return fibArray[index];
        }

        // value not in memo structure
        fibValue = fibHelper(n - 1) + fibHelper(n - 2);
        fibArray[index] = fibValue;
        return fibValue;
    }
}