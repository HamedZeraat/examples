package inheritance;

/**
 * Created by keith on 27/11/2017.
 */
public interface Base {
    final static String THING = "AHHHHHHHHHHHHHHHHHHH!";

    String myString();

    default String myThing() {
        return THING;
    }

    static String myOtherThing() {
        return THING + THING;
    }
}
