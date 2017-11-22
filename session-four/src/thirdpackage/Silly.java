package thirdpackage;

import spec.MyInterface;

/**
 * Created by keith on 20/11/2017.
 */
public class Silly extends secondpackage.Silly implements MyInterface {
    @Override
    public int nothingVeryInteresting() {
        return 999;
    }

    @Override
    public String somethingElse(){
        return "Something different";
    }

//    public abstract void thing(); // Will require the class to be abstract
}
