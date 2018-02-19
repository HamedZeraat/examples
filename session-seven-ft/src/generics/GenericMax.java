package generics;

public class GenericMax {
//    Generic method to return the largest of three Comparable objects

    // determines the largest of three Comparable objects
    public static <T extends Comparable<T>> T max(T x, T y, T z) {
        T max = x; // assume x is initially the largest
        if (y.compareTo(max) > 0) {
            max = y; // y is the largest so far
        }
        if (z.compareTo(max) > 0) {
            max = z; // z is the largest now
        }
        return max; // returns the largest object
    }

    public static void main(String args[]) {
        System.out.printf("Max of %d, %d and %d is %d\n\n",
                3, 4, 5, max(3, 4, 5));

        System.out.printf("Max of %.1f,%.1f and %.1f is %.1f\n\n",
                6.6, 8.8, 7.7, max(6.6, 8.8, 7.7));

        System.out.printf("Max of %s, %s and %s is %s\n", "pear",
                "apple", "orange", max("pear", "apple", "orange"));

        Person p1 = new Person("Fred", 35);
        Person p2 = new Person("Betty", 21);
        Person p3 = p1;

        // max(p1,p2,p3);

    }
}
