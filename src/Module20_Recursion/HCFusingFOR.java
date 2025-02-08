package Module20_Recursion;

import java.util.Scanner;

public class HCFusingFOR {
    public static int hcf(int a,int b) {
        for (int i=Math.min(a,b);i>=0;i--){
            if((a%i==0) && (b%i==0)){
                return i;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a");
        int a=sc.nextInt();
        System.out.println("enter b");
        int b= sc.nextInt();
        System.out.println(hcf(a,b));
    }
}
