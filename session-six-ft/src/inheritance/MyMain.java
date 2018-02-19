package inheritance;

/**
 * Created by keith on 27/11/2017.
 */
public class MyMain {
    public static void main(String[] args) {
        //Object a = new C();
        //System.out.println(((C)a).myMethod());
        A avar = new C(12);
        //System.out.println(avar.myMethod()); // dynamic dispatch or static binding
        System.out.println(avar);
//        avar = new B();
//        System.out.println(avar.myMethod()); //


    }
}
