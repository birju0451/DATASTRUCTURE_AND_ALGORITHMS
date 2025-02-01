package Module20_Recursion;

import java.util.Scanner;

public class MazePath3 {
    public static int maze(int m,int n){
        if(m==1 || n==1) return 1;
        int rightway=maze(m,n-1);
        int downway=maze(m-1,n);
        return rightway+downway;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of row:");
        int m=sc.nextInt();
        System.out.println("Enter the number of column:");
        int n=sc.nextInt();
        System.out.println("total number of ways : "+maze(m,n));
    }
}
