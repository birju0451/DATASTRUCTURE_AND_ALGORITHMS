package Module33_hashmaps_and_hashsets_Part_1.TreeSet;

import java.util.*;

public class _03_Custom_Sorting{
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>(Comparator.reverseOrder());
        set.add(10);
        set.add(20);
        set.add(30);

        System.out.println(set); // [30, 20, 10] (descending order)
    }
}
