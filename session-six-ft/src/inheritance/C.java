package inheritance;

/**
 * Created by keith on 27/11/2017.
 */
public class C extends B {
    private int i;

    public C(){
        // super()
        System.out.println("Cons C");
    }

    public C(int i){
        this();
        setI(i);
    }

    private int getI() {
        return i;
    }

    private void setI(int i) {
        System.out.println("Setting i");
        this.i = i;
    }

    public static String myMethod(){
        return "From C > ";
    }


    @Override
    public String toString() {
        return "C{" +
                "i=" + i +
                '}';
    }
}
