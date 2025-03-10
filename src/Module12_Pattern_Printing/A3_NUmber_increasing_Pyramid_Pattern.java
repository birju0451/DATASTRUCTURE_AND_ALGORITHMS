package Module12_Pattern_Printing;

import java.util.Scanner;

public class A3_NUmber_increasing_Pyramid_Pattern {
    public static void print1(int n){
        int i,j;
        for ( i = 1; i <=n ; i++) {
            for ( j = 1; j <=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        print1(n);
    }
}
