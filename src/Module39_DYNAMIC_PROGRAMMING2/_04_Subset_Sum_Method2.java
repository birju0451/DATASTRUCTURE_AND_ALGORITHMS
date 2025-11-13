package Module39_DYNAMIC_PROGRAMMING2;

public class _04_Subset_Sum_Method2 {
    public static void main(String[] args) {
        int[] arr = {8,5,2,4};
        int target = 9;
        System.out.println(SubsetSum(0,arr,target));
    }

    private static boolean SubsetSum(int i, int[] arr, int target){
        if(i==arr.length){
            if(target == 0) return true;
            else return false;
        }
        boolean skip = SubsetSum(i+1,arr,target);
        if(target-arr[i]<0) return skip;//this is only for positive number
        boolean pick = SubsetSum(i+1,arr,target-arr[i]);
        return pick || skip;
    }
}
