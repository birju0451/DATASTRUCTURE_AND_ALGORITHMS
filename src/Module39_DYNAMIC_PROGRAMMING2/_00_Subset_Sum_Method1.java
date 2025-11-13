package Module39_DYNAMIC_PROGRAMMING2;

public class _00_Subset_Sum_Method1 {
    public static void main(String[] args) {
        int[] arr = {8,5,2,4};
        int target = 9;
        System.out.println(SubsetSum(0,0,arr,target));
    }

    private static boolean SubsetSum(int i, int sum, int[] arr, int target){
        if(i==arr.length){
            if(sum == target) return true;
            else return false;
        }
        boolean pick = SubsetSum(i+1,sum+arr[i],arr,target);
        boolean skip = SubsetSum(i+1,sum,arr,target);
        return pick || skip;
    }
}
