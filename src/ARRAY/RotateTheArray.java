package ARRAY;

public class RotateTheArray {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60,70};
        int n=arr.length;
        int k=10;
        k=k%n;
        System.out.println("n="+n+" "+"k="+k);
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        int i=0,j=n-k-1;
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

        System.out.println();
        i=n-k;
        j=n-1;
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

        System.out.println();
        i=0;j=n-1;
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
