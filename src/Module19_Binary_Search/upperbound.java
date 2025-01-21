package Module19_Binary_Search;

import java.util.Scanner;

public class upperbound {
    public static void main(String[] args) {
        int[] arr={10,23,46,46,91,97,97,140};
        int n=arr.length;
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        int ub=n;
        int low=0,high=n-1;
        while(low <= high){
            int mid=low+(high-low)/2;
            if(arr[mid] > target){
                ub=Math.min(ub,mid);
                high=mid-1;
            }
            else low=mid+1;
        }
        System.out.println("the lower bound of the "+target+" is "+ub);
    }
}
