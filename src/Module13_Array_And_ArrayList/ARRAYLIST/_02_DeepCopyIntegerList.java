package Module13_Array_And_ArrayList.ARRAYLIST;

import java.util.*;

public class _02_DeepCopyIntegerList {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);

        // Copy methods (all safe for Integers)
        ArrayList<Integer> list2 = new ArrayList<>(list1);      // Constructor
        ArrayList<Integer> list3 = (ArrayList<Integer>) list1.clone(); // clone()

        // Modify list2
        list2.set(0, 99);

        System.out.println("list1: " + list1); // [10, 20, 30]
        System.out.println("list2: " + list2); // [99, 20, 30]
        System.out.println("list3: " + list3); // [10, 20, 30]
    }
}
