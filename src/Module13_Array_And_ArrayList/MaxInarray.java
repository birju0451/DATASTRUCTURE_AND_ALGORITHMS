package Module13_Array_And_ArrayList;

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
}