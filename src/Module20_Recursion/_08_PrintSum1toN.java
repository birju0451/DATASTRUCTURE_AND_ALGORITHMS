package Module20_Recursion;

import java.util.Scanner;

public class _08_PrintSum1toN {
    public  static int  sum(int n) {
        if(n==1){
            return 1;
        }
        int ans=n+sum(n-1);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a  number");
        int n=sc.nextInt();
        int ans=sum(n);
        System.out.println(ans);
    }
}

//public class PrintSum1toN {
//    public  static int  sum(int x,int n) {
//        if(x==n) return n;
//        int ans=x+sum(x+1,n);
//        return ans;
//    }
//    public static void main(String[] args) {
//        Scanner sc =new Scanner(System.in);
//        System.out.println("Enter a  number:");
//        int n=sc.nextInt();
//        int result=sum(1,n);
//        System.out.println(result);
//    }
//}
