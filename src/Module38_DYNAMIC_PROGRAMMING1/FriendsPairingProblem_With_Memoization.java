package Module38_DYNAMIC_PROGRAMMING1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class FriendsPairingProblem_With_Memoization {
    private static int pair(int n,int[] dp){
        if (n<=2) return n;
        if(dp[n] != -1) return dp[n];
        int ans =pair(n-1,dp)+(n-1)*pair(n-2,dp);
        dp[n] = ans;
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new  int[n+1];//it is good habit to their result in place like i want to store 3 but array is zero based indexing so i will take one extra size
        Arrays.fill(dp,-1);
        System.out.println(pair(n,dp));
    }
}
