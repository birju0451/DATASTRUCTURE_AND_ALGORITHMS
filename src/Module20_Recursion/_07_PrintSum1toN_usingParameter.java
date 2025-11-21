package Module20_Recursion;

import java.util.Scanner;

public class _07_PrintSum1toN_usingParameter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n :");
        int n = sc.nextInt();
        sum(n,0);
    }
    private static void sum(int n, int s) {
        if(n ==0){
            System.out.println(s);
            return;
        }
        sum(n-1,s+n);
    }
}
