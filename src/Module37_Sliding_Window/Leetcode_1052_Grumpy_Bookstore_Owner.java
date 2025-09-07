package Module37_Sliding_Window;

public class Leetcode_1052_Grumpy_Bookstore_Owner {
    public static int maxSatisfied(int[] customers, int[] grumpy, int k) { //where k = minutes
        int max_unsatisfied=0;
        int n=grumpy.length;
        int a=0,b=0;
        int i=0,j=k-1;
        while(j<n){
            int unsatisfied = 0;
            for(int x=i;x<=j;x++){
                unsatisfied += (customers[x]*grumpy[x]);
            }
            if(unsatisfied > max_unsatisfied){
                max_unsatisfied = unsatisfied;
                a=i;b=j;
            }
            i++;
            j++;
        }
        for(int y=a;y<=b;y++){
            grumpy[y] = 0;
        }
        int ans = 0;
        for(int z=0;z<n;z++){
            if(grumpy[z] == 0) ans +=customers[z];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] customers = {};
        int[] grumpy = {};
        int minutes = 3;
        maxSatisfied(customers,grumpy, minutes);
    }
}
