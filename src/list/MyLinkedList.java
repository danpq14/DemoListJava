package list;

public class MyLinkedList {
    private Node head;
    private int numNodes;

    public MyLinkedList(Object data){
        head = new Node(data);
    }

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

        public void add(int index, Object data) {
            Node temp = head;
            Node holder;

            for (int i = 0; i<index-1 &&temp.next != null; i++) {
                temp = temp.next;
            }
            holder = temp.next; //holder tạm giữ giá trị của biến tại vị trí index
            temp.next = new Node(data);//Gán giá trị của biến tại vị trí index = data (giá trị muốn thêm vào)
            temp.next.next = holder;// Gán giá trị của biến tại vị trí index.next = giá trị cũ của biến tại index
            numNodes++;//tăng size
        }

        public void addFirst(Object data) {
            Node newHead = new Node(data);
            newHead.next = head;
            head = newHead;
        }

        public Node remove(int index) {
        Node previousNode = head;
        for (int i = 0; i < index -1 ; i++) {
            previousNode = previousNode.next;
        }
            Node removeNode = previousNode.next;
        previousNode.next = removeNode.next;
        return removeNode;
        }

        public Node getData(int index){
            Node temp = head;

            for (int i=0; i<index;i++){
                temp = temp.next;
            }
            return temp;
        }

        public void printList(){
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
