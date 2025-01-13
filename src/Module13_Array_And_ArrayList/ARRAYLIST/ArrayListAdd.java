package Module13_Array_And_ArrayList.ARRAYLIST;

import java.util.ArrayList;

public class ArrayListAdd {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        System.out.println(list + " "+ list.size());

        list.add(10);
        System.out.println(list + " "+ list.size());

        list.add(20);
        System.out.println(list + " "+ list.size());

        list.add(30);
        System.out.println(list + " "+ list.size());

        list.add(40);
        System.out.println(list + " "+ list.size());

        list.remove(2);
        System.out.println(list + " "+ list.size());

    }
}
