package Module39_DYNAMIC_PROGRAMMING2;

public class _05_Subset_Sum_with_Memoization2 {
    private static boolean SubsetSum(int i, int[] arr, int target,int[][] dp){
        if(i<0){
            if(target == 0) return true;
            else return false;
        }
        if(dp[i][target] != -1) return (dp[i][target] == 1);
        boolean ans = false;
        boolean skip = SubsetSum(i-1,arr,target,dp);
        if(target-arr[i]<0) {
            ans = skip;
        }else{
            boolean pick = SubsetSum(i-1,arr,target-arr[i],dp);
            ans = pick || skip;
        }
        if(ans) dp[i][target] = 1;
        else dp[i][target] = 0;
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {8,5,2,4};
        int target = 7; int n = arr.length;
        // i -> n-1 to 0 | target -> target to 0
        int[][] dp = new  int[n][target+1];//I want the col till target
        for (int i = 0; i < dp.length; i++){
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(SubsetSum(n-1,arr,target,dp));
    }
}
