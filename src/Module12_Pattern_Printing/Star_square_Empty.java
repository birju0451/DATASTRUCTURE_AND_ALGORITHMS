package Module12_Pattern_Printing;

import java.util.Scanner;

public class Star_square_Empty {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        for (int i = 0; i < r; i++) {
            if (i==0 || i==(r-1)){
                for (int j = 0; j < c; j++) {
                    System.out.print("*  ");
                }
                System.out.println();
            }
            else{
                System.out.print("* ");
            }
            for (int j = 1; j < c-1; j++) {
                System.out.print("#  ");
            }

            System.out.println();
        }
    }
}
