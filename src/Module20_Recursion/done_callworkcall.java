package Module20_Recursion;

import java.util.Scanner;

public class done_callworkcall {
    public static void print(int n){
        if(n==0) return ;//base case
        print(n-1);//call
        System.out.println(n);//work
        print(n-1);//call
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        print(n);//5
    }
}
//this is very difficult to track call using pan ans paper