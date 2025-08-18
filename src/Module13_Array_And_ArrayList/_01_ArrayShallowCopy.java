package Module13_Array_And_ArrayList;

public class _01_ArrayShallowCopy {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = arr1; // same reference

        arr2[0] = 99;
        System.out.println("arr1[0]: " + arr1[0]); // 99
    }
}
