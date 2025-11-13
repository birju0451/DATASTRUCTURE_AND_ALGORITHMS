package Module39_DYNAMIC_PROGRAMMING2;

public class _03_Subset_Sum_for_Negative_Method1 {
    public static void main(String[] args) {
        int[] arr = {8,-1,2,4};
        int target = 7;
        System.out.println(SubsetSum(0,0,arr,target));
    }

    private static boolean SubsetSum(int i, int sum, int[] arr, int target){
        if(i==arr.length){
            if(sum == target) return true;
            else return false;
        }
        boolean skip = SubsetSum(i+1,sum,arr,target);
//        if(sum > target) return skip;//this is only for positive number
        boolean pick = SubsetSum(i+1,sum+arr[i],arr,target);
        return pick || skip;
    }
}
