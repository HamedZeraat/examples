package comparable;

public class MyCompare implements Comparable{
    private int value;

    public MyCompare(int value){
        this.value = value;
    }

    @Override
    public int compareTo(Object o) {
        return this.value - ((MyCompare)o).value;
    }
}
