package Module33_hashmaps_and_hashsets_Part_1.HashSet;

import java.util.HashSet;

public class _02_Set_Iterate {
    public static void main(String[] args) {
        HashSet<Integer> s = new HashSet<>();
        int[] arr = {2, 4, 9, 3, 2, 5, 3};
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
        s.add(20);
        s.add(100);
        s.add(-8);
        s.add(34);
        System.out.println("The element of the Set:");
        for (int ele : s) {
            System.out.print(ele + " ");
        }
        s.clear();
        System.out.println("\n"+s);
    }
}
