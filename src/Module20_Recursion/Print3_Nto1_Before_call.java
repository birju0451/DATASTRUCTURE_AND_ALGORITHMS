package Module20_Recursion;

import java.util.Scanner;

public class Print3_Nto1_Before_call {
    public static void print(int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
        print(n-1);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        print(n);//5
    }
}
