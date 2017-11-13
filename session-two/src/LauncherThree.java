import java.util.Random;

/**
 * Created by keith on 13/11/2017.
 */
public class LauncherThree {
    public static void main(String[] args) {
        final int i = 10; // constant

        Random rand = new Random();
        for (int index=0; index < 10; index++) {
            System.out.println(rand.nextInt());
        }
    }
}
