package recurse;

public class MyFibTester {
    public static long LIMIT = 55;

    public static void main(String[] args) {
        System.out.println("Fib(" + LIMIT + ") is " + Fibonacci.fibonacci(LIMIT));
        System.out.println("Fib iter(" + LIMIT + ") is " + Fibonacci.fibonacci_iterative(LIMIT));
    }
}
