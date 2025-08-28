package Module33_hashmaps_and_hashsets_Part_1.HashSet;

import java.util.HashSet;

public class _03_AddSameInSet {
    public static void main(String[] args) {
        HashSet<String>  set = new HashSet<>();
        set.add("Birju");
        set.add("Birju");
        set.add("Birju");
        set.remove("Birju");
        System.out.println(set);
    }
}
