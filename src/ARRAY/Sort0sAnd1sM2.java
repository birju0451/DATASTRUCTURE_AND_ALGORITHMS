package ARRAY;

public class Sort0sAnd1sM2 {
    public static void main(String[] args) {
        int[] nums={1,0,0,1,1,0,1,1,0,1};
        int n=nums.length;
        int noOfZeros=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0) noOfZeros++;
        }
        for(int i=0;i<n;i++){
            if(i<noOfZeros) nums[i]=0;
            else nums[i]=1;
        }
        for(int ele:nums){
            System.out.print(ele+" ");
        }

    }
}
