package list;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInterger = new MyList<Integer>();
        listInterger.add(1);
        listInterger.add(2);
        listInterger.add(3);
        listInterger.add(4);


        System.out.println("Element 0 : " + listInterger.get(0));
        System.out.println("Element 1 : " + listInterger.get(1));
        System.out.println("Element 2 : " + listInterger.get(2));
        System.out.println("Element 3 : " + listInterger.get(3));
        System.out.println("Element 7 : " + listInterger.get(7));

    }
}
