package Module38_DYNAMIC_PROGRAMMING1;

public class Leetcode_509_Fibonacci_Number {
    class Solution{
        static int[] dp;
        public int fibo(int n){
            if(n<=1) return n;
            //step 1.cheak if the value of call present in the dp or not
            if(dp[n] != 0) return dp[n];
            int ans = fibo(n-1) + fibo(n-2);
            //step 2.
            dp[n]=ans;
            return ans;
        }
        public int fib(int n){
            dp = new    int[n+1];
            return fibo(n);
        }
    }
    public static void main(String[] args) {

    }
}
