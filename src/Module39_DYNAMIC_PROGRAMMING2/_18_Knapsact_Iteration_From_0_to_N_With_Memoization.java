package Module39_DYNAMIC_PROGRAMMING2;

public class _18_Knapsact_Iteration_From_0_to_N_With_Memoization {
    public static int profit(int i,int[] wt,int[] val,int C,int[][] dp){
        if(i==wt.length) return 0;
        if(dp[i][C] != -1) return dp[i][C];
        int skip = profit(i+1,wt,val,C,dp);
        if(wt[i]>C) return dp[i][C] = skip;
        int pick = val[i] + profit(i+1,wt,val,C-wt[i],dp);
        return dp[i][C] = Math.max(pick,skip);
    }
    public static void main(String[] args) {
        int[] val = {5,3,9,16};
        int[] wt = {1,2,8,10};
        int C = 8;
        int  n = wt.length;;
        // i=0 to n-1 | C = C to 0
        int[][] dp = new int[n][C+1];
        for (int i = 0; i < dp.length; i++){
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(profit(0,wt,val,C,dp));
    }
}
