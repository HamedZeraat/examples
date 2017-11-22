package statics;

public class MyClass {
    private long myValue;

    public static final long VALUE = 10L; // const

    public static long doubleIt(long l){
        return 2 * l;
    }

    public MyClass(long val){
        myValue = val;
    }

    public long addTo(long l){
        return myValue + l;
    }
}
