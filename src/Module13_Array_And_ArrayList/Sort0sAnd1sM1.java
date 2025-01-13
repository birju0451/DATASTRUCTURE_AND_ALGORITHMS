package Module13_Array_And_ArrayList;

public class Sort0sAnd1sM1 {
    public static void main(String[] args) {
        int[] arr={1,0,0,1,1,0,1,1,0,1,0,0};
        int n=arr.length;
        int i=0,j=n-1;
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
        for(int k :arr){
            System.out.print(k+" ");
        }
    }
}
