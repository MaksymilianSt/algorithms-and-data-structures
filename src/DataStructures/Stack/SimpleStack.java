package DataStructures.Stack;

import java.util.Arrays;

public class SimpleStack <T> {
    private Object [] stack = new Object [10];
    private int top = 0;
    public void push(T element){
        stack[top++] = element;
        if(top == stack.length)
            doubleStackArray();
    }
    public T pop(){
        if (top == 0) throw new ArrayIndexOutOfBoundsException("stack is empty");
        return (T) stack[(top--) -1];
    }
    public T peek(){
        if (top == 0) throw new ArrayIndexOutOfBoundsException("stack is empty");
        return (T) stack[top -1];
    }
    public int size(){
        return top;
    }
    private void doubleStackArray(){
       stack = Arrays.copyOf(stack,stack.length * 2);
    }



}
