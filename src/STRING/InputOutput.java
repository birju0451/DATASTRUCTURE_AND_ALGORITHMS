package STRING;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name");
        //String str=sc.next();//next only read one string after the space it can not print anything
        String str=sc.nextLine();
        System.out.print("Hii ");
        System.out.println(str);
    }
}
