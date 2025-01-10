package ARRAY;

public class Merge {
    public static void main(String[] args) {
        int[] a = {4, 52, 60, 72, 90};
        int[] b = {12, 42, 50, 70};
        int size = a.length + b.length;
        int[] c = new int[size];
        int i = a.length - 1, j = b.length - 1, k = size - 1;

        // Merging in descending order
        while (i >= 0 && j >= 0) {
            if (a[i] > b[j]) {
                c[k] = a[i];
                i--;
            } else {
                c[k] = b[j];
                j--;
            }
            k--;
        }

        // Handling remaining elements in array `b`
        while (j >= 0) {
            c[k] = b[j];
            j--;
            k--;
        }

        // Handling remaining elements in array `a`
        while (i >= 0) {
            c[k] = a[i];
            i--;
            k--;
        }

        // Print the merged array
        for (int ele : c) {
            System.out.print(ele + " ");
        }
    }
}
