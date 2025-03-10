package Module12_Pattern_Printing;

import java.util.Scanner;

public class Double_mountain {
    public static void PrintPattern(int n){
        int i, j,k;
        for ( i = 1; i <=n ; i++) {
            for ( j = 0; j <=n-i ; j++) {
                System.out.print(" ");
            }
            for ( j = 0; j <i ; j++) {
                System.out.print(i+" ");
            }
            for ( j = 1; j <=2*(n-i) ; j++) {
                System.out.print(" ");
            }
            for ( j = 0; j <i ; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n= 6;
        PrintPattern(n);
    }
}
