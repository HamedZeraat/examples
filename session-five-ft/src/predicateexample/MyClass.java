package predicateexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyClass {
    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(1); lst.add(2); lst.add(3); lst.add(3); lst.add(6);
        //lst = Arrays.asList(1,2,3,4,5);

//        for (Integer i: lst){
//            System.out.println(i);
//        }
//
//        lst.forEach(x -> System.out.println(x));
        lst.forEach(System.out::println);
        lst.removeIf(x -> x % 2 == 0);
        lst.forEach(System.out::println);
    }
}
