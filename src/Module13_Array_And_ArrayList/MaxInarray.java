package Module13_Array_And_ArrayList;

import java.util.Arrays;

public class MaxInarray {
    public static void main(String[] args) {
        int[] arr={-41,-45,-85,-94,-75,-10,78};
        int max=arr[0];
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        System.out.println("the max element in the array is :"+max);
    }

    public static class shadowcopyofarray {
        public static void main(String[] args) {
            // Original array
            int[] original = {1, 2, 3, 4};

            // Copy the array
            int[] copied = Arrays.copyOf(original, original.length);

            // Modify the copied array
            copied[0] = 10;

            // Print arrays to show they are independent
            System.out.println("Original: " + Arrays.toString(original));
            System.out.println("Copied: " + Arrays.toString(copied));
        }
    }
}