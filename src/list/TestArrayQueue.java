package list;

public class TestArrayQueue {
    public static void main(String[] args) {
        ArrayQueue myArray = new ArrayQueue(5);

        myArray.enqueue(0);
        myArray.enqueue(1);
        myArray.enqueue(2);
        myArray.enqueue(3);
        myArray.enqueue(4);
        myArray.print();
        System.out.println("---------------------");
        myArray.enqueue(5);
        myArray.print();
        System.out.println(("--------------------"));
        myArray.dequeue();
        myArray.print();
        System.out.println(myArray.isQueueFull());
        System.out.println(myArray.isQueueEmpty());
        myArray.enqueue(6);
        System.out.println(myArray.isQueueFull());
        System.out.println(myArray.getCurrentSize());
    }
}
