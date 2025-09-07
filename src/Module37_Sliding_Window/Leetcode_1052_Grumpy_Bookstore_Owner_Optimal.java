package Module37_Sliding_Window;

public class Leetcode_1052_Grumpy_Bookstore_Owner_Optimal {
    public static int maxSatisfied(int[] arr, int[] grumpy, int k) { //where k = minutes
        int n = arr.length,i = 0,j = k-1,unsatisfied = 0;
        int a=i, b=j,maxUsatisfied = 0;
        for (int x = i; x <=j ; x++) {
            if(grumpy[x] == 1) unsatisfied += arr[x];
        }

        while (j<n){
            if(unsatisfied > maxUsatisfied){
                maxUsatisfied = unsatisfied;
                a = i;b = j;
            }
            i++;j++;
            if(j<n && grumpy[j] == 1) unsatisfied += arr[j];
            if(grumpy[i-1] == 1) unsatisfied -= arr[i-1];
        }

        for(int y=a;y<=b;y++){
            grumpy[y] = 0;
        }
        int ans = 0;
        for(int z=0;z<n;z++){
            if(grumpy[z] == 0) ans +=arr[z];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] customers = {1,0,1,2,1,1,7,5};
        int[] grumpy = {0,1,0,1,0,1,0,1};
        int minutes = 3;
        int ans =  maxSatisfied(customers,grumpy, minutes);
        System.out.println(ans);
    }
}
