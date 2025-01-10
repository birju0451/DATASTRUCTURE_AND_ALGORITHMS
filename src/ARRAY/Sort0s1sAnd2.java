package ARRAY;

public class Sort0s1sAnd2 {
    public static void main(String[] args) {
        int[] arr={1,2,0,1,2,0,1,0,1,2};
        int n=arr.length;
        int noOfzeros=0,noOfone=1;
        for(int i=0;i<n;i++){
            if(arr[i]==0) noOfzeros++;
            if(arr[i]==1) noOfone++;
        }
        for(int i=0;i<n;i++){
            if(i<noOfzeros) arr[i]=0;
            else if(i<noOfzeros+noOfone-1) arr[i]=1;
            else arr[i]=2;
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }

    }
}
