package Module33_hashmaps_and_hashsets_Part_1.HashMap;

import java.util.HashMap;

public class _04_Two_Sum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] arr = {-1,-1};
        for(int i = 0; i < nums.length; i++){
            int remaining = target-nums[i];
            if(!map.containsKey(remaining)){
                map.put(nums[i],i);
            }else{
                arr[0] = map.get(remaining);
                arr[1] = i;
                break;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr ={1,2,4,3,5,3,};
        int[] ans = twoSum(arr,9);
        for (int ele:ans){
            System.out.print(ele+" ");
        }
    }
}
