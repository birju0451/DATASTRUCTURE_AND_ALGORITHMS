package Module13_Array_And_ArrayList;

public class LinearSearch1 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int x = 30;

        for (int j : arr) {
            if (x == j) {
                System.out.print("Yes element Found");
                break;
            }
        }
    }
}