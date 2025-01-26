package Module13_Array_And_ArrayList.ARRAYLIST;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String[] arr = {"apple", "mango", "orange", "apple"};
//method 1.
        // Use a LinkedHashSet to maintain insertion order
        Set<String> set = new LinkedHashSet<>(Arrays.asList(arr));

        // Convert the set back to an array if needed
        String[] uniqueArr = set.toArray(new String[0]);

        // Print the array with duplicates removed
        System.out.println("Array without duplicates: " + Arrays.toString(uniqueArr));


//        //method 2
//        Set<String> set = new HashSet<>();
//
//        for (String s:arr) {
//            set.add(s);
//        }
//        System.out.println(set);
    }
}
