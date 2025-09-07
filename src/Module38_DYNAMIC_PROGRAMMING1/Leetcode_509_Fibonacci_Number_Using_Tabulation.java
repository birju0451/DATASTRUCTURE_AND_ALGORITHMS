package Module38_DYNAMIC_PROGRAMMING1;

public class Leetcode_509_Fibonacci_Number_Using_Tabulation {
    static class Solution {
        public int fibo(int n){
            if(n<=1) return n;
            int[] dp = new int[n+1];
            dp[0] = 0;dp[1]=1;
            for (int i = 2; i <=n; i++) {
                dp[i]=dp[i-1]+dp[i-2];
            }
            return dp[n];
        }
    }

    public static void main(String[] args) {
        Leetcode_509_Fibonacci_Number_Using_Recursion_And_Memoization.Solution sol = new Leetcode_509_Fibonacci_Number_Using_Recursion_And_Memoization.Solution();
        int n = 10; // Example input
        System.out.println("Fibonacci of " + n + " = " + sol.fib(n));
    }
}
