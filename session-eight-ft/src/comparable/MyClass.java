package comparable;

/**
 * Created by keith on 04/12/2017.
 */
public class MyClass {
    public static void main(String[] args) {
        MyCompare m = new MyCompare(13);
        MyCompare n = new MyCompare(13);

        System.out.println(m.compareTo(n)); //m < n
    }
}
