package box;

public class GenericBox<Type> {
    private Type t;

    public void add(Type t) {
        this.t = t;
    }

    public Type get() {
        return t;
    }
}
