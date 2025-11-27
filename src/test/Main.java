package test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i) !=' '){
                sb.append(s.charAt(i));
            }
        }
        String rev = sb.toString();
        char[] arr = new char[s.length()];
        for (int i=0;i< arr.length;i++){
            if(s.charAt(i) ==' ') arr[i] = ' ';
        }
        int x =0;
        for (int i=0;i< arr.length;i++){
            if(arr[i] != ' ') arr[i] = rev.charAt(x++);
        }
        String a= new String(arr);
        System.out.println(a);
    }
}
