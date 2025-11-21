package Module39_DYNAMIC_PROGRAMMING2;

public class _21_Thinking_Of_Recursion_To_Tabulation {
    public static int profit(int i,int[] wt,int[] val,int C,int[][] dp){
        if(i<0) return 0;
        if(dp[i][C] != -1) return dp[i][C];
        int skip = profit(i-1,wt,val,C,dp);
        if(wt[i]>C) return dp[i][C] = skip;
        int pick = val[i] + profit(i-1,wt,val,C-wt[i],dp);
        return dp[i][C] = Math.max(pick,skip);
        /*
        if(wt[i]>C) return dp[i][C] = skip;
        int pick = val[i] + profit(i-1,wt,val,C-wt[i],dp);
        return dp[i][C] = Math.max(pick,skip);

        this part can be also written as:---
        if(wt[i]>C) return dp[i][C] = skip;
        else{
        int pick = val[i] + profit(i-1,wt,val,C-wt[i],dp);
        return dp[i][C] = Math.max(pick,skip);
        }
        */
    }
    public static void main(String[] args) {
        int[] val = {5,3,7,16};
        int[] wt = {1,2,8,10};
        int C = 8;
        int  n = wt.length;;
        // i=n-1 to 0 | C = C to 0
        int[][] dp = new int[n][C+1];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < C+1; j++) {
                int skip = (i>0) ? dp[i-1][j] : 0;//Note that when i = 0 the first one beocome -1
                if(wt[i] > j)  dp[i][j] = skip;
                else{
                    //int pick =  val[i] + dp[i][j-wt[i]];
                    int pick =  val[i];
                    pick += (i>0) ? dp[i-1][j-wt[i]] : 0;
                    dp[i][j] = Math.max(pick,skip);
                }
            }
        }
        System.out.println(dp[n-1][C]);
    }
}
