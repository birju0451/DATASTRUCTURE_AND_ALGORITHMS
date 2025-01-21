package Module20_Recursion;

import java.util.Scanner;

public class Print1_1toN_usingGlobalvariable {
    static int n;//note:-Global variable can accessible anywhere in code
    public static void  print(int x){
        if(x>n) return; //base case
        System.out.println(x);//work
        print(x+1);//call
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        n=sc.nextInt();
        print(1);
    }
}
