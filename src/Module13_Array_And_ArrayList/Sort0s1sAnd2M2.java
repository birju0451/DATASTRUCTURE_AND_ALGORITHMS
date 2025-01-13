package Module13_Array_And_ArrayList;

public class Sort0s1sAnd2M2 {
    public static void main(String[] args) {
        int[] arr={1,2,0,1,2,0,1,0,1,2};
        int n=arr.length;
        int low=0,mid=0,high=n-1,temp;
        while(mid<=high){
            if(arr[mid]==0){
                temp=arr[mid];
                arr[mid]=arr[low];
                arr[low]=temp;
                low++;mid++;
            }
            else if(arr[mid]==1) mid++;
            else {//if(arr[mid]==2)
                temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }

    }
}
