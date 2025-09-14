package Module38_DYNAMIC_PROGRAMMING1;

import java.util.Scanner;

public class FriendsPairingProblem {
    private static int pair(int n){
        if (n<=2) return n;
        return pair(n-1)+(n-1)*pair(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(pair(n));
    }
}
