package list;

public class StackTest {

    public static void main(String[] args) {
        MyLinkedListStack<Integer> myStack = new MyLinkedListStack<>();
        myStack.push(0);
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        myStack.push(6);
        myStack.print();

    }

}
