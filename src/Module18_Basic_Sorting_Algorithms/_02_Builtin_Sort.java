package Module18_Basic_Sorting_Algorithms;

import java.util.Arrays;

public class _02_Builtin_Sort {
    public static void main(String[] args) {
        int[] arr = {7,2,3,5,1,6,3,63,-4};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nElement after the Builtin sort:");
        Arrays.sort(arr);
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
