package firstpackage;

import spec.MyInterface;

/**
 * Created by keith on 20/11/2017.
 */
public class Silly implements MyInterface{
    @Override
    public String message(String s) {
        return "< " + s;
    }

    @Override
    public int nothingVeryInteresting() {
        return 99;
    }
}
