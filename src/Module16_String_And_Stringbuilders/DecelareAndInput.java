package Module16_String_And_Stringbuilders;

import java.util.Scanner;

public class DecelareAndInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Name:");
        String str = sc.next();
        System.out.println(str);

        System.out.println("Enter Your Name: ");
        String str1 = sc.nextLine();
        System.out.println(str1);

        System.out.println("Enter Your number");
        int num1 = sc.nextInt();
        System.out.println(num1);
    }
}
