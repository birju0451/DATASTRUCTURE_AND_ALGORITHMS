package Module18_Basic_Sorting_Algorithms;

import java.util.Scanner;

import static java.util.Collections.swap;

public class test {
    public static void main(String[] args) {
        int[] arr = {5, -7, 1, -3, 8, -10};
        int n = arr.length;

        for (int i = 0; i < n; i++){
            for (int j = 0; j <n-1-i; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
