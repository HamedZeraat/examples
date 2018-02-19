package box;

public class Box {
    private Object t;

    public void add(Object t) {
        this.t = t;
    }

    public Object get() {
        return t;
    }
}