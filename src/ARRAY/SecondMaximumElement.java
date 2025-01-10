package ARRAY;
//find the second-largest element in the given array
public class SecondMaximumElement {
    public static void main(String[] args) {
        int[] arr={-41,-45,-85,-94,-75,-100,-12,-50};
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
           mx=Math.max(mx,arr[i]);
        }
        int smx=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=mx){
                smx=Math.max(smx,arr[i]);
            }
        }
        System.out.println(smx);
    }
}
