package Module33_hashmaps_and_hashsets_Part_1.TreeMap;

import java.util.*;

public class _01_Basic_TreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        // Adding elements
        map.put(3, "Apple");
        map.put(1, "Banana");
        map.put(2, "Mango");
        map.put(5, "Orange");
        map.put(4, "Grapes");

        System.out.println("TreeMap: " + map);

        // Accessing
        System.out.println("Value for key 3: " + map.get(3));

        // First and last keys
        System.out.println("First Key: " + map.firstKey());
        System.out.println("Last Key: " + map.lastKey());

        // Lower and higher
        System.out.println("Lower Key of 3: " + map.lowerKey(3));
        System.out.println("Higher Key of 3: " + map.higherKey(3));
    }
}

