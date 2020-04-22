package list;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.add(3, "dân");

        ll.getData(3);
        ll.printList();
        System.out.println("--------------------");


    }
}
