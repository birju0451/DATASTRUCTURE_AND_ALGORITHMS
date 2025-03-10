package Module20_Recursion;

import java.util.Scanner;

public class Generate_Parantheses {
    public static  void Print_parantheses(int open,int close,int n,String s){
        if(s.length()==2*n){
            System.out.println(s);
            return;
        }
        if(open<n) Print_parantheses(open+1,close,n,s+"(");
        if(close<open ) Print_parantheses(open,close+1,n,s+")");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n=sc.nextInt();
        Print_parantheses(0,0,n,"");
    }
}
