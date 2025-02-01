package Module20_Recursion;

import java.util.Scanner;

public class MazePath2 {
    public static int maze(int row,int col,int m,int n){
        if(row==m || col==n) return 1;
        int rightway=maze(row,col+1,m,n);
        int downway=maze(row+1,col,m,n);
        return rightway+downway;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of row");
        int m=sc.nextInt();
        System.out.println("Enter the number of column");
        int n=sc.nextInt();
        System.out.println("total number of ways : "+maze(1,1,m,n));
    }
}
