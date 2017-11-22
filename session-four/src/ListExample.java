import java.util.ArrayList;
import java.util.List;

/**
 * Created by keith on 20/11/2017.
 */
public class ListExample {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        for(int i = 1; i <= 5; i++){ // i -> Object - Wrapper
            l.add(i); // l.add(Integer.valueOf(i));
        }
//        Integer i = Integer.valueOf(3);
//        System.out.println(i); // i.valueOf(i)

        System.out.println(l.size());
        for(int i: l){
            System.out.println(i);
        }
    }
}
