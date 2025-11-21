package Module38_DYNAMIC_PROGRAMMING1;

public class _02_Minimum_Cost_ClimingStair {
    public static int minCost(int[] cost,int n){
        if(n<=1) return cost[n];
        return cost[n] + Math.min(minCost(cost, n-1), minCost(cost, n-2));
    }

    public static void main(String[] args) {
        int[] cost = {1,2,3,4,50,6};
        int n = cost.length;

        int ans = Math.min(minCost(cost, n-1), minCost(cost, n-2)); // ✔ FIXED
        System.out.println(ans);
    }
}
