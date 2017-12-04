package stacks.arraylistimpl;

import stacks.Stack;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class StackImpl<T> implements Stack<T> {
    private List stack;

    public StackImpl(){
        stack = new ArrayList<T>();
    }

    @Override
    public void push(T item) {
        stack.add(item);
    }

    @Override
    public T pop() throws EmptyStackException {
        if (! isEmpty()){
            return (T)stack.remove(stack.size()-1);
        } else {
            throw new EmptyStackException();
        }
    }

    @Override
    public T peek() throws EmptyStackException {
        T result = this.pop();
        this.push(result);
        return result;
    }

    @Override
    public boolean isEmpty() {
        return stack.size() == 0;
    }
}
