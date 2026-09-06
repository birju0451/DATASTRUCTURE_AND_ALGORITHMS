package Module13_Array_And_ArrayList;

public class Sort0sAnd1sM1 {
    public static void swapMethod1(int[] arr, int i,int j){
        while(i<j){
            if(arr[i]==0) i++;
            if(arr[j]==1) j--;
            if(i>j) break;
            if((arr[i]==1 && arr[j]==0 ||arr[i]==0 && arr[j]==0 ||arr[i]==1 && arr[j]==1)){
                arr[i]=0;
                arr[j]=1;
                i++;j--;
            }
        }
    }
    public static void swapMethod2(int[] arr, int l, int r) {
        while (l<=r){
            if(arr[l]==1 && arr[r]==0){
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
            }
            else if(arr[l] == 0) l++;
            else if(arr[r] == 1) r--;
        }
    }
    public static void main(String[] args) {
        int[] arr={1,0,0,1,1,0,1,1,0,1,0,0};
        int n=arr.length;

        int i=0,j=n-1;
        swapMethod1(arr,i,j);
        System.out.println("Method 1 sorting technique");
        for(int k :arr){
            System.out.print(k+" ");
        }
        System.out.println();

        arr= new int[]{1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0, 0};
        i=0;
        j=n-1;
        swapMethod2(arr,i,j);
        System.out.println("Method 2 sorting technique");
        for(int k :arr){
            System.out.print(k+" ");
        }
    }


}
