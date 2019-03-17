package StackArray;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an E[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class GenericStack<E> {
    private E[] array;
    public GenericStack() {
        array = (E[]) new Object[0];

    }

    public void push(E element) {
        array = Arrays.copyOf(array, array.length+1);
        array[array.length-1] = element;
    }

    public E pop() throws IndexOutOfBoundsException{
        if(isEmpty()){
            throw new IndexOutOfBoundsException();
        }
        E[] temp = Arrays.copyOf(array, array.length);
        array = Arrays.copyOf(array, array.length-1);
        return temp[temp.length-1];

    }

    public boolean isEmpty() {
        if(array.length == 0){
            return true;
        }
        return false;
    }
}
