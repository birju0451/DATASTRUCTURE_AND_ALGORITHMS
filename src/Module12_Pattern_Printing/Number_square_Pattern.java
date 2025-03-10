package Module12_Pattern_Printing;

import java.util.Scanner;

public class Number_square_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= m; j++) {
                System.out.print( j +" ");
            }
            System.out.println();
        }
    }
}
