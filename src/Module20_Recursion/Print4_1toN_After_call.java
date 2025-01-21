package Module20_Recursion;
import java.util.Scanner;

public class Print4_1toN_After_call {
    public static void print(int n){
        if(n==0){
            return ;
        }
        print(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        print(n);//5
    }
}
