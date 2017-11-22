/**
 * @author Lenny
 *         <p>
 *         Example one from the Monday session...
 */
public class ExampleOne {
    public static void main(String[] args) {

        final int SILLY_NUMBER = 99;

        int[][] intArray = {{1, 2, 3, 4, 5},
                {2, 3, 4, 5},
                {7, 8, 9}
        };

        print(intArray);
        intArray[2][0] = 99;
        for(int i = 0; i < intArray.length; i++){
            for(int j = 0; j < intArray[i].length; j++){
                intArray[i][j] = SILLY_NUMBER;
            }
        }
        print(intArray);

//        for(int item: intArray){
//            System.out.println(item);
////            System.out.printf("%2d-%4d\n",item,item);
//        }
    }

    private static void print(int[][] intArray) {
        for (int[] row : intArray) { // foreach
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
        System.out.println("======================");
    }
}
