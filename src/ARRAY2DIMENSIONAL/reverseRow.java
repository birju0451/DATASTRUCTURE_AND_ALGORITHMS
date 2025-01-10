package ARRAY2DIMENSIONAL;

import java.util.Scanner;

public class reverseRow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: \n");
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        System.out.println("Enter the element of the Array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        int low=0,high = arr.length-1;
        int p=0,q=0;
        while(low < high){
            while(p <arr[low].length && q<arr[high].length){
                int temp =arr[low][p];
                arr[low][p]=arr[high][q];
                arr[high][q]=temp;
                p++; q++;
            }
            low++;high--;
        }

        System.out.println("the array element are :");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
