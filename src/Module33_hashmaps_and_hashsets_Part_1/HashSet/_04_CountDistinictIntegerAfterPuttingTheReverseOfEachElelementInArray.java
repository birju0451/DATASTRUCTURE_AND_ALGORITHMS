package Module33_hashmaps_and_hashsets_Part_1.HashSet;

import java.util.HashSet;

public class _04_CountDistinictIntegerAfterPuttingTheReverseOfEachElelementInArray {
    public static void reverse(int n, HashSet<Integer> set){
        int rev = 0;
        while(n>0){
            int digit = n%10;
            rev = rev*10+digit;
            n = n/10;
        }
        set.add(rev);
    }
    public static int  countDistinctIntegers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            reverse(nums[i],set);
        }
        return set.size();
    }
    public static void main(String[] args) {
        int[] arr = {1,13,12,10,31};
        System.out.println(countDistinctIntegers(arr));
    }
}
