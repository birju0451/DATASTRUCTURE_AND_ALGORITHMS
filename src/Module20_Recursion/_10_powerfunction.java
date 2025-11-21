package Module20_Recursion;
import java.util.Scanner;
public class _10_powerfunction {
    public static int pow(int a,int b){
        if(b==0) return 1;
        return a*pow(a,b-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base:");
        int a=sc.nextInt();
        System.out.println("Enter the power");
        int b=sc.nextInt();
        int ans=pow(a,b);
        System.out.println(ans);
    }
}
