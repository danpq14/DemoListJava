package list;

import java.util.LinkedList;

public class MyLinkedListStack<T> {
    private LinkedList<T> stack;

    public MyLinkedListStack() {
        stack = new LinkedList<>();
    }

    public void push(T t) {
        stack.addFirst(t);
    }

    public T pop() throws Exception  {
        if (isEmpty()) {
            throw new Exception("List rỗng");
        }
        return stack.removeLast();
    }

    public int size() {
        return stack.size();
    }

    public boolean isEmpty() {
        if (size() == 0){
            return true;
        }
        return false;
    }

    public void print(){
        while (!isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
