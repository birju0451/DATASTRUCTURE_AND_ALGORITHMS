package Module33_hashmaps_and_hashsets_Part_1;

import java.util.HashMap;

public class Leetcode_1814_Count_Nice_PairsInArray_OPTIMAL {
    public static int rev(int n){
        int r = 0;
        while (n>0){
            int rem = n %10;
            r=r*10+rem;
            n /=10;
        }
        return r;
    }
    public static void main(String[] args) {
        int[] nums = {42,11,1,97};
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length ;i++){
            int ele = nums[i]-rev(nums[i]);
            if(map.containsKey(ele)){
                count +=map.get(ele);
                count  =count % 1000000007;
                map.put(ele,map.get(ele)+1);
            }else{
                map.put(ele,1);
            }
        }
        System.out.println(count);
    }
}
