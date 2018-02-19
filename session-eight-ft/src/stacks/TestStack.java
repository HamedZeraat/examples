package stacks;

import stacks.arraylistimpl.StackImpl;

import java.util.EmptyStackException;

public class TestStack {
    public static void main(String[] args) {
        Stack<String> stack = new StackImpl<>();

        String s = new String("first");

        stack.push(s);
        if (stack.isEmpty()){
            System.err.println("Shouldn't be empty");
        }

        stack = new StackImpl<>();

        stack.push(s);
        if (!s.equals(stack.pop()) ){
            System.err.println("Should be the same - pop failed");
        }

        stack = new StackImpl<>();

        try {
            stack.pop();
            System.err.println("Should have thrown an exception for pop on empty");
        } catch (EmptyStackException ex){
            throw ex;
        }
    }
}
