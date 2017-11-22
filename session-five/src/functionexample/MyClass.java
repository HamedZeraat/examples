package functionexample;

import java.util.function.Function;

public class MyClass {
    public static void main(String[] args) {
        //MyFunction<Integer,Long> myfunc = new MyFunction<>();
        //System.out.println(myPrint("The output is ", myfunc, 3));
        System.out.println(myPrint("The output is ", (x -> (long)x), 3));
    }

    public static <T,R> String myPrint(String s, Function<T,R> myf,T x){
        return s + myf.apply(x);
    }
}
