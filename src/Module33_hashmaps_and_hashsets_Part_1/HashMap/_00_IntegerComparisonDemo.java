package Module33_hashmaps_and_hashsets_Part_1.HashMap;
import java.lang.*;
public class _00_IntegerComparisonDemo {

    public static void main(String[] args) {
        // 1. int vs Integer
        int a = 5;                   // primitive
        Integer b = 5;                // object (autoboxed)
        System.out.println("int a = " + a);
        System.out.println("Integer b = " + b);

        // 2. Comparing two Integer objects
//        Integer x1 = new Integer(100);
//        Integer x2 = new Integer(100);
        Integer x1 = Integer.valueOf(100);  // recommended
        Integer x2 = Integer.valueOf(100);

        System.out.println("\nComparing two new Integer(100):");
        System.out.println("x1 == x2 : " + (x1 == x2));        // false (different objects)
        System.out.println("x1.equals(x2) : " + x1.equals(x2));// true (same numeric value)

        // 3. Integer caching between -128 and 127
        Integer y1 = 100;   // uses cached object
        Integer y2 = 100;   // same cached object

        System.out.println("\nComparing cached Integers (100):");
        System.out.println("y1 == y2 : " + (y1 == y2));        // true (same cached object)
        System.out.println("y1.equals(y2) : " + y1.equals(y2));// true

        // 4. Larger Integers (not cached)
        Integer z1 = 128;
        Integer z2 = 128;

        System.out.println("\nComparing non-cached Integers (128):");
        System.out.println("z1 == z2 : " + (z1 == z2));        // false (different objects)
        System.out.println("z1.equals(z2) : " + z1.equals(z2));// true (same numeric value)

        // 5. Why this matters in HashMap anagram check
        java.util.HashMap<Character, Integer> map1 = new java.util.HashMap<>();
        java.util.HashMap<Character, Integer> map2 = new java.util.HashMap<>();

        // Add values (imagine char 'a' appeared 128 times)
        map1.put('a', 128);
        map2.put('a', 128);

        System.out.println("\nHashMap value comparison:");
        System.out.println("map1.get('a') == map2.get('a') : " + (map1.get('a') == map2.get('a'))); // false ❌
        System.out.println("map1.get('a').equals(map2.get('a')) : " + map1.get('a').equals(map2.get('a'))); // true ✅

        // 6. Rule of thumb
        System.out.println("\nRule of thumb:");
        System.out.println("== / != → use for primitives (int, char, etc.)");
        System.out.println(".equals() → use for objects (Integer, String, HashMap values, etc.)");
    }
}
