package list;

public class MyLinkedListQueue {
    private Node head;
    private Node tail;

    class Node {
        private int key;
        private Node next;

        public Node(int key) {
            this.key = key;
            this.next = null;
        }
    }

    public MyLinkedListQueue(){
    }

    public void enqueue(int key) {
        Node temp = new Node(key);

        if (this.tail == null) {
            this.head = this.tail = temp;
            return;
        }
        this.tail.next = temp;
        this.tail = temp;
    }

    public Node dequeue() {
        if (this.head == null) {
            return null;
        }

        Node temp = this.head; //Temp giữ giá trị của head hiện tại
        this.head = this.head.next; // bàn giao lại cho phần tử thứ 2(head.next) thành head
        if(this.head == null) {
            this.tail = null; //nếu chỉ có 1 phần tử, gán lại thành List rỗng;
        }
        return temp;
    }
}


