package inheritance;

/**
 * Created by keith on 27/11/2017.
 */
public class B extends A {
    public B(){
        //super();
        System.out.println("Cons B");
    }

    public static String myMethod(){
        return "From B >";
    }

}
