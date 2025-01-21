package Module19_Binary_Search;

import java.util.Scanner;

class solution{
    public  int search(int[] arr ,int target){
        int n=arr.length;
        int low=0,high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }

}
public class binarysearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter the size of array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.printf("Enter the target element");
        int x=sc.nextInt();
        solution s=new solution();
        int ans=s.search(arr,x);
        System.out.println(ans);
    }
}
