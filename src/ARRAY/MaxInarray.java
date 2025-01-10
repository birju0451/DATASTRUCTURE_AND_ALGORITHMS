package ARRAY;

public class MaxInarray {
    public static void main(String[] args) {
        int[] arr={-41,-45,-85,-94,-75,-10,};
        int max=arr[0];
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        System.out.println(max);
    }
}
