package ARRAY;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr={10,15,19,34,45};
        int[] brr={16,17,24,39,49};
        int size= arr.length+ brr.length;
        int[] crr=new int[size];
        int i=0,j=0,k=0;
        while((i< arr.length && j<brr.length)){
            if(arr[i]<=brr[j]){
                crr[k]=arr[i];
                i++;
            }else{
                crr[k]=brr[j];
                j++;
            }
            k++;
        }
        if(i==arr.length){
            while(j<brr.length){
                crr[k]=brr[j];
                j++;k++;
            }
        }else {//(j==brr.length)
            while(i<arr.length){
                crr[k]=arr[i];
                    i++;k++;
            }
        }

        for(int ele:crr){
            System.out.print(ele+" ");
        }
    }
}
