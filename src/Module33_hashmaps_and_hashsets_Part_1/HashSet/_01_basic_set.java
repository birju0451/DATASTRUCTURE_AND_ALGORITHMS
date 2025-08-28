package Module33_hashmaps_and_hashsets_Part_1.HashSet;

import java.util.HashSet;

public class _01_basic_set {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        //insert
        set.add(20);
        set.add(100);
        set.add(-8);
        set.add(34);
        //.size()
        System.out.println("Size is "+set.size());
        set.add(39);
        set.add(43);
        System.out.println("Size is "+set.size());
        //Search - true/false : TC : O(1)
        System.out.println(set.contains(-7));
        set.add(34);
        System.out.println(set.contains(34));
        //remove  TC : O(1)
        set.remove(39);
        System.out.println("Size is "+set.size());
        set.remove(38);
        System.out.println("Size is "+set.size());

        //toArray();
        Object[] arr =set.toArray(new Integer[0]);
        for (int i = 0; i < arr.length; i++) {

        }



    }
}
