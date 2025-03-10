package Module12_Pattern_Printing;

import java.util.Scanner;

public class Alphabate_Square_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n=sc.nextInt();
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                char ch=(char)(j+65);
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}
