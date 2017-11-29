package inheritance;

/**
 * Created by keith on 27/11/2017.
 */
public class A implements Base {

    public A(){
        //super();
        System.out.println("Cons A ");
    }

    @Override
    public String myString() {
        return null;
    }

    public static String myMethod(){
        return "From A >";
    }
}
