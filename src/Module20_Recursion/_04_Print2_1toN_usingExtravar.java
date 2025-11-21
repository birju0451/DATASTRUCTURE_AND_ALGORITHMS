package Module20_Recursion;
import java.util.Scanner;
public class _04_Print2_1toN_usingExtravar {
    public static void print(int x,int n){
        if(x>n) return;
        System.out.println(x);
        print(x+1,n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        print(1,n);
    }
}
