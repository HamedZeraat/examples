/**
 * Created by keith on 15/11/2017.
 */
public class Increment {
    public static void main(String[] args) {
        final int BIGNUM = 10;

//        int i = 0;
//
//        System.out.println(i++);
//        System.out.println(++i);
//        System.out.println(i--);
//        System.out.println(--i);

        for (int i = 0, j = 0; i < BIGNUM; i++) {
            System.out.println("Value is " + i);
        }

        {
            int i = 0;
            int j = 0;
            while (i < BIGNUM) {
                // ...
                System.out.println("Value is " + i);
                i++;
            }
        }
    }
}
