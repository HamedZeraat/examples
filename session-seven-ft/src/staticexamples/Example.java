package staticexamples;

public class Example {
    private static int counter;

    static {
        counter = 0;
    }

    public Example(){
        Example.incCounter();
    }

    private static void incCounter(){
        counter++;
    }

    public static Integer getCount(){
        return counter;
    }
}

