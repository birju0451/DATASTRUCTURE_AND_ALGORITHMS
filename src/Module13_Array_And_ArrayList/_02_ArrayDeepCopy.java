package Module13_Array_And_ArrayList;

import java.util.Arrays;

public class _02_ArrayDeepCopy {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};

        // Method 1: Using clone()
        int[] arr2 = arr1.clone();

        // Method 2: Using Arrays.copyOf()
        int[] arr3 = Arrays.copyOf(arr1, arr1.length);

        arr2[0] = 99;

        System.out.println("arr1[0]: " + arr1[0]); // 1
        System.out.println("arr2[0]: " + arr2[0]); // 99
    }
}
