package fibmemo;

public class Fibonacci {

    public static long fibArray[] = new long[26];

    public static long fibonacci(long n) {
        long fibValue = 0;
        if (fibArray[(int) n] != -1) {
            return fibArray[(int) n];
        } else {
            fibValue = fibonacci(n - 1) + fibonacci(n - 2);
            fibArray[(int) n] = fibValue;
            return fibValue;
        }
    }

    public static void main(String args[]) {
        for (int x=0; x < fibArray.length; x++){
            fibArray[x]=-1;
        }
        fibArray[0] = 0;
        fibArray[1] = 1;
        long preTime = System.currentTimeMillis();
        System.out.println("Value of 25th number in Fibonacci series->" + fibonacci(25));
        long postTime = System.currentTimeMillis();
        System.out.println("Time taken to compute in milliseconds->" + (postTime - preTime));
    }
}