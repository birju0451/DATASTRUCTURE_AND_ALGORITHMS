package Module1_Question_Practice;

import java.util.Scanner;

public class _02_Find_smallest_Number_In_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the size of array:");
        int n = sc.nextInt();
        int[] number = new int[n];
        for (int i = 0; i < number.length; i++) {
            number[i] = sc.nextInt();
        }
        for(int i = 0; i < number.length; i++) {
            System.out.print(number[i]+" ");
        }
        int min = Integer.MAX_VALUE;
        for (int k = 0; k < number.length; k++) {
            if(number[k]<min){
                min = number[k];
            }
        }
        System.out.println("Minimum number in the array is : " + min);
    }
}
