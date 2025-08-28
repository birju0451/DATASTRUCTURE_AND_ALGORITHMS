package Module33_hashmaps_and_hashsets_Part_1.TreeSet;

import java.util.TreeSet;

public class _02_TreeSetWithString {
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>();
        names.add("Birju");
        names.add("Amit");
        names.add("Manish");
        names.add("Ayaush");

        System.out.println(names);
        // Output: [Amit, Ayaush, Birju, Manish] (alphabetical order)
    }
}
