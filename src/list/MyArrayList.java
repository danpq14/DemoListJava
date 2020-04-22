package list;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList{
    public static void main(String[] args) {
        List<Integer> myArrayList = new ArrayList<>();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);
        myArrayList.add(5);
        myArrayList.add(6);
        myArrayList.add(7);
        System.out.println("In ra myArray");
        System.out.println(myArrayList.toString());
        System.out.println("-------------------------------------");
        System.out.println("loại bỏ phần tử ở vị trí index = 3");
        myArrayList.remove(3);
        System.out.println(myArrayList.toString());
        System.out.println("-------------------------------------");
        System.out.println("phương thức Clear() xóa toàn bộ phần tử");
        myArrayList.clear();
        System.out.println(myArrayList.isEmpty());
        System.out.println(myArrayList);
        System.out.println("-------------------------------------");
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);
        System.out.println(myArrayList.size());
        System.out.println("-------------------------------------");
        System.out.println(myArrayList.contains(3));
        System.out.println(myArrayList.contains(5));
        System.out.println("-------------------------------------");
        System.out.println("phương thức isEmpty kiểm tra 1 ArrayList có rỗng hay ko");
        System.out.println(myArrayList.isEmpty());
        System.out.println("-------------------------------------");
        System.out.println("index Òf");
        System.out.println(myArrayList.indexOf(3));
        System.out.println("-------------------------------------");
        int index = myArrayList.size();
        index --;
        myArrayList.add(index,10);
        System.out.println(myArrayList.size());
        System.out.println(myArrayList.toString());
        System.out.println("-------------------------");


    }
}
