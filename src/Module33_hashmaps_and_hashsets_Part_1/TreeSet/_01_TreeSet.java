package Module33_hashmaps_and_hashsets_Part_1.TreeSet;

import java.util.*;

public class _01_TreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        // Adding elements
        set.add(50);
        set.add(10);
        set.add(30);
        set.add(20);
        set.add(40);

        // Duplicate ignored
        set.add(30);

        System.out.println("TreeSet: " + set);
        // Output: [10, 20, 30, 40, 50] (sorted order)

        // Accessing methods
        System.out.println("First element: " + set.first());   // 10
        System.out.println("Last element: " + set.last());     // 50
        System.out.println("Higher than 30: " + set.higher(30)); // 40
        System.out.println("Lower than 30: " + set.lower(30));   // 20
    }
}
