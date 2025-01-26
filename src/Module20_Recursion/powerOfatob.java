package Module20_Recursion;

import java.util.Scanner;

public class powerOfatob {
    public static int pow(int a,int b){
        if(b==0){
            return 1;
        }
        return a*pow(a,b-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a:");
        int a=sc.nextInt();
        System.out.println("Enter b:");
        int b=sc.nextInt();
        int ans=pow(a,b);
        System.out.println(ans);
    }
}
