package StackArrayList;

import java.util.ArrayList;

/**
 * Implement Stack<E> by adding the push, pop, and isEmpty functions.  It must pass the prewritten unit tests.
 * If you pop on an empty stack, throw an IndexOutOfBoundsException.
 */
public class Stack<E> {

    private ArrayList stack;


    public Stack(){
        stack = new ArrayList();
    }

    public void push(E element) {
        stack.add(element);
    }

    public E pop() throws Exception {
        if(isEmpty()){
            throw new IndexOutOfBoundsException();
        }
        return (E)stack.remove(stack.size()-1);
    }

    public Boolean isEmpty() {
        if(stack.size() == 0) {
            return true;
        }
        return false;
    }
}
