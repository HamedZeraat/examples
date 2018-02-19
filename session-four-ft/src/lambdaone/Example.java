package lambdaone;

import java.util.Arrays;
import java.util.List;

/**
 * Created by keith on 20/11/2017.
 */
public class Example {
//        (x,y) -> { return x + y;}
//        x -> x * x;
//        () -> operation...;
    private static final int var = 10; // static variable capture

    public static void main(String[] args) {
        List<Integer> intSeq = Arrays.asList(1, 2, 3);
// lambda expression, i.e., an anonymous function
        //intSeq.forEach(x -> System.out.println(x));
// Method reference
        //intSeq.forEach(System.out::println);

        //Classname::staticMethod
        //Classname::new
        //Classname::instanceMethod
//        int var = 10; // local variable capture

        // look at the Consumer interface from java.util.function
        intSeq.forEach(x -> { // could be (Integer x)
            //x += 2;
            int y = x * var;
            System.out.println(y);
        });

//        for(Integer i: intSeq){
//            print(i);
//        }

    }

//    private static void print(Integer i){
//        System.out.println(i);
//    }
}
