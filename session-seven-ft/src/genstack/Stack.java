package genstack;

public interface Stack<T> {
    void push(T x);
    T pop();
    T top();
    boolean isEmpty();
}
