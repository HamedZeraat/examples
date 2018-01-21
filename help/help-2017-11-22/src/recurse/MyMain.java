package recurse;

public class MyMain {
    public static final long VALUE = 25;
    public static void main(String[] args) {
        System.out.println("Factorial of " + VALUE + ": " + Factorial.factorial(MyMain.VALUE));
        System.out.println("iFactorial of " + VALUE + ": " + Factorial.factorial_iterative(MyMain.VALUE));
    }
}
