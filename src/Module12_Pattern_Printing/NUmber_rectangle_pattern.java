package Module12_Pattern_Printing;

import java.util.Scanner;

public class NUmber_rectangle_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n=sc.nextInt();
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print( j +" ");
            }
            System.out.println();
        }
    }
}