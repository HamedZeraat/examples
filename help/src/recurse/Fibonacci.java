package recurse;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static List<Long> memo = new ArrayList<>();

    public static long fibonacci(long n){
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static long fibonacci_iterative(long n){
        long oldValue = 0;
        long newValue = 1;

        if (n == 0){
            return 0;
        }
        for (long index=0; index < n - 1; index++){
            long temp = oldValue;
            oldValue = newValue;
            newValue = temp + newValue;
        }
        return newValue;
    }

    public static long fibonacci_memo(long n){
        if (memo.size() < n){
            // add it to memo memo[n] = fibonacci_memo(n - 1) + fibonacci_memo(n - 2);
            memo.add(fibonacci_memo(n - 1) + fibonacci_memo(n - 2));
        }
        return memo.get((int)n);
    }
}
