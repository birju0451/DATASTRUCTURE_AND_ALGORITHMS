package Module38_DYNAMIC_PROGRAMMING1;

public class Leetcode_509_Fibonacci_Number_Using_Recursion_And_Memoization {
    static class Solution {
        static int[] dp;

        // Top-down recursion with memoization
        public int fibo(int n) {
            if (n <= 1) return n;

            // Step 1: check if value already computed
            if (dp[n] != -1) return dp[n];

            int ans = fibo(n - 1) + fibo(n - 2);

            // Step 2: store result in dp
            dp[n] = ans;
            return ans;
        }

        public int fib(int n) {
            dp = new int[n + 1];

            // Initialize dp with -1
            for (int i = 0; i <= n; i++) {
                dp[i] = -1;
            }

            return fibo(n);
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 10; // Example input
        System.out.println("Fibonacci of " + n + " = " + sol.fib(n));
    }
}
