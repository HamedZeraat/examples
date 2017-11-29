package genstack;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementation of the Stack interface containing Integer elements
 */
public class GenericStack implements Stack {
    // Add items to the "list" so the "top" of the stack is the end of the list
    private List stack;

    public GenericStack(){
        stack = new ArrayList();
    }
    @Override
    public void push(Integer x) {
        stack.add(x);
    }

    @Override
    public Integer pop() throws RuntimeException{
        try {
            return (Integer) stack.remove(stack.size() - 1);
        }
        catch (Exception ex){
            throw new RuntimeException("Stack empty");
        }
    }

    @Override
    public Integer top() {
        // pop the top element and then re-stack it
        try {
            Integer tmp = pop();
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
