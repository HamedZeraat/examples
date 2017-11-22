package secondpackage;

import spec.MyInterface;

/**
 * Created by keith on 20/11/2017.
 */
public abstract class Silly implements MyInterface{
    @Override
    public String message(String s) {
        return "[ " + s;
    }
}
