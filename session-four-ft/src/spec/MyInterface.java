package spec;

/**
 * Created by keith on 20/11/2017.
 */
public interface MyInterface {
    // original interface requirements
    public String message(String s);
    public int nothingVeryInteresting();

    // include code that is generally useful to this interface
    public static String aMethod(){
        return "Prints something out";
    }

    // what it says "on the tin"!
    public default String somethingElse(){
        return "Something Else";
    }
}
