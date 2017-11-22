package functionexamplearrays;

import java.util.Comparator;

/**
 * Created by keith on 22/11/2017.
 */
public class MyComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Integer && o2 instanceof Integer) {
            return (Integer)o1 - (Integer)o2;
        }
        return 0;
    }
}
