package Module39_DYNAMIC_PROGRAMMING2;

public class _01_Subset_Sum_Method1 {
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
        if(sum > target) return pick;//this is only for positive number because next positive will with any number that value will increase  only
        boolean skip = SubsetSum(i+1,sum,arr,target);
        return pick || skip;
    }
}
//Note :- question no 01 and 02 are same