package functionexamplearraysaic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class MyMain {

//    private static class MyComparator implements Comparator {
//        @Override
//        public int compare(Object o1, Object o2) {
//            if (o1 instanceof Integer && o2 instanceof Integer) {
//                return (Integer)o2 - (Integer)o1;
//            }
//            return 0;
//        }
//    }
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Random r = new Random();
        for (int i=0; i < intArray.length; i++) {
            intArray[i] = r.nextInt();
        }
//        Comparator mc = new MyComparator();
        printIt(intArray);
//        Arrays.sort(intArray,new MyComparator());
//        Arrays.sort(intArray, new Comparator() {
//            public int compare(Object o1, Object o2) {
//                if (o1 instanceof Integer && o2 instanceof Integer) {
//                    return (Integer)o2 - (Integer)o1;
//                }
//                return 0;
//            }
//        }
//        );
        Arrays.sort(intArray,(x,y) -> y - x);
        printIt(intArray);
    }

    public static void printIt(Integer[] intArray){
        System.out.println("***** OUTPUT *****");
        for (int item : intArray) {
            System.out.println(item);
        }
    }
}

// AIC - Anonymous Inner Classes
