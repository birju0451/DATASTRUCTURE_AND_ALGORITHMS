package Module33_hashmaps_and_hashsets_Part_1;

public class Leetcode_1814_Count_Nice_PairsInArray {
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
        for(int i = 0;i<nums.length ;i++){
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] + rev(nums[j]) == nums[j] + rev(nums[i])){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
