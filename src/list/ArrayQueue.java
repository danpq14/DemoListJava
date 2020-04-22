package list;

public class ArrayQueue {
    private int capacity;
    private int queArr[];
    private int currentSize;

    public ArrayQueue(int queSize){
        queArr = new int[queSize];
        this.capacity = queSize;
    }

    public void ensureCapacity(){
        capacity = capacity*2;
        int[] newArray = new int[capacity];
        for (int i= 0; i<queArr.length; i++) {
            newArray[i] = queArr[i];
        }
        queArr = newArray;
    }


    public int getCurrentSize(){
        return currentSize;
    }

    public boolean isQueueFull() {
        if (currentSize == queArr.length ) {
            return true;
        }
        return false;
    }

    public boolean isQueueEmpty(){
        if (currentSize == 0) {
            return true;
        }
        return false;
    }

    public void enqueue(int data){
        if (isQueueFull()) {
            ensureCapacity();
        }
        queArr[currentSize] = data;
        currentSize++;
    }

    public int dequeue()  {
        if (isQueueEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        if (currentSize == 1) {
            int temp = queArr[0];
            int[] newArray =new int[capacity];
            queArr = newArray;
            currentSize--;
            return temp;
        }
        int temp = queArr[0];
        int[] newArray = new int[currentSize-1];
        for (int i=0; i<currentSize-1; i++){
            newArray[i] = queArr[i+1];
        }
        queArr = newArray;
        currentSize--;
        return temp;
    }

    public void print() {
        for (int i=0; i<currentSize; i++){
            System.out.println(queArr[i]);
        }
    }
}
