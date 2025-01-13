package Module13_Array_And_ArrayList;

public class MinInArray {
    public static void main(String[] args) {
        int[] arr={-41,-45,-85,-94,-75,-10,};
        int min=arr[0];
        for (int j : arr) {
            if (j < min) {
                min = j;
            }
        }
        System.out.println(min);
    }
}
