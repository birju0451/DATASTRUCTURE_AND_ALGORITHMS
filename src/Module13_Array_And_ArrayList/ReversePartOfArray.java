package Module13_Array_And_ArrayList;

public class ReversePartOfArray {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60,70,80};
        int n=arr.length;

        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        int i=1,j=6;
        while(i<=j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        System.out.println();
        for(int ele:arr){
            System.out.print(ele+" ");
        }

    }
}
