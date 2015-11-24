package net.nopainnocode.dsaa.datastructures;

import java.util.Stack;

/**
 * Created by no_pain_no_code on 2015. 11. 24..
 */
public class ImplementedQueue<E>{

    private Stack<E> inStack;
    private Stack<E> outStack;

    public ImplementedQueue(){

        inStack = new Stack<E>();
        outStack = new Stack<E>();
    }

    public boolean push(E element) {
        inStack.push(element);

        return true;
    }

    public E pop(){

        inToOut();

        return outStack.pop();
    }


    public E peek() {

        inToOut();

        return outStack.peek();
    }

    public void clear() {

        inStack.clear();
        outStack.clear();
    }

    private void inToOut() {
        if(outStack.empty())
            for (E element : inStack)
                outStack.push(element);
    }

}
