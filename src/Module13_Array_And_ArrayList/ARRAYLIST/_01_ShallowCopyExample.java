package Module13_Array_And_ArrayList.ARRAYLIST;

import java.util.*;

public class _01_ShallowCopyExample {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");

        // Shallow Copy (new list but same elements)
        ArrayList<String> list2 = new ArrayList<>(list1);

        list2.set(0, "X");   // Changes element reference, not affecting list1
        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);
    }
}
