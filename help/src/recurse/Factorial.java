package recurse;

public class Factorial {
    public static long factorial(long number){
//        System.out.println("factorial has been called with n = " + number);
        if (number == 0){
            return 1;
        } else {
//            return result;
            return number * factorial(number - 1);
        }
    }

    public static long factorial_iterative(long number){
        long result = 1;
        for(long index = 2; index <= number; index++){
            result *= index;
        }
        return result;
    }
}
