package app;

import firstpackage.Silly;
import spec.MyInterface;

/**
 * Created by keith on 20/11/2017.
 */
public class MyMain {
    public static void main(String[] args) {
//        MyInterface my = new firstpackage.Silly();
//        MyInterface mytwo = new secondpackage.Silly();
//        System.out.println(my.message("Thing"));
//        System.out.println(mytwo.message("Thing"));
        MyInterface my = new Silly();
        System.out.println(my.message("Thing"));
        System.out.println(my.nothingVeryInteresting());
        System.out.println(MyInterface.aMethod());
        System.out.println(my.somethingElse());
    }
}
