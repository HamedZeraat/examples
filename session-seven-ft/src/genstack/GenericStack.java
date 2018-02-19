package genstack;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementation of the Stack interface containing Integer elements
 */
public class GenericStack<T extends Number> implements Stack<T> {
    // Add items to the "list" so the "top" of the stack is the end of the list
    private List<T> stack;

    public GenericStack(){
        stack = new ArrayList<>();
    }
    @Override
    public void push(T x) {
        stack.add(x);
    }

    @Override
    public T pop() throws RuntimeException{
        try {
            return stack.remove(stack.size() - 1);
        }
        catch (Exception ex){
            throw new RuntimeException("Stack empty");
        }
    }

    @Override
    public T top() {
        // pop the top element and then re-stack it
        try {
            T tmp = pop();
            push(tmp);
            return tmp;
        }
        catch (Exception ex){
            throw new RuntimeException("Can't get top element");
        }
    }

    @Override
    public boolean isEmpty() {
        return stack.size() == 0;
    }
}
