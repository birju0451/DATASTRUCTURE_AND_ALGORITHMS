package Basic_Java;

import java.util.Scanner;
public class _23_Exit_function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println("AAA");

        if (a == 10) {
            System.exit(0);// If a == 10, the program terminates immediately.
        }

        System.out.println("BBB");
    }
}
//Difference between return exit