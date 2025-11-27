package Module39_DYNAMIC_PROGRAMMING2;

public class _22_Thinking_Of_Recursion_To_Tabulation_Subset {
    private static boolean SubsetSum(int i, int[] arr, int target,int[][] dp){
        if(i==arr.length){
            if(target == 0) return true;
            else return false;
        }
        if(dp[i][target] != -1) return (dp[i][target] == 1);
        boolean ans = false;
        boolean skip = SubsetSum(i+1,arr,target,dp);
        if(target-arr[i]<0) {
            ans = skip;
        }else{
            boolean pick = SubsetSum(i+1,arr,target-arr[i],dp);
            ans = pick || skip;
        }
        if(ans) dp[i][target] = 1;
        else dp[i][target] = 0;
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {8,5,2,4};
        int target = 7;
        // i -> 0 to n-1 | target -> target to 0
        int n = arr.length;
        int[][] dp = new  int[n][target+1];//I want the col till target
        for (int i = 0; i < dp.length; i++){
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(SubsetSum(0,arr,target,dp));
    }
}
