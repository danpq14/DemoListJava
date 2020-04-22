package list;

import java.util.Arrays;

public class ArrayStack {
    private final int DEFAULT_CAPACITY = 10;
    private int capacity;
    private Object stackArr[]  ;
    private int size = 0;


    public void ArrayStack(){
        stackArr = new Object[DEFAULT_CAPACITY];
        this.capacity = DEFAULT_CAPACITY;
    }

    public void ensureCapa() {
        capacity = capacity*2;
        stackArr = Arrays.copyOf(stackArr,capacity);
    }

    public void push(Object data) {
        if (size == stackArr.length) {
            ensureCapa();
        }
        stackArr[size] = data;
        size++;
    }

    public void pop(){
        if (size == 0) {
            System.out.println("Stack Array is Empty");
            return;
        }
        stackArr = Arrays.copyOfRange(stackArr,0,size-2);
        size--;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return (size == 0);
    }

    public boolean isFull(){
        return (size==stackArr.length);
    }

    public Object[] reverse() {
        Object[] newArray = new Object[stackArr.length];
        for (int i=0; i<stackArr.length; i++) {
            newArray[i] = stackArr[stackArr.length-i-1];
        }
        stackArr = newArray;
        return stackArr;
    }

}
