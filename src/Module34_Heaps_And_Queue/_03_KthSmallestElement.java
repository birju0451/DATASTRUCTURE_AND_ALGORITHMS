package Module34_Heaps_And_Queue;

import java.util.PriorityQueue;

public class _03_KthSmallestElement {
    public static void main(String[] args) {
        int[] arr = {10,2,8,3,-6,-2,9,-12};
        int k = 4;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int ele : arr){
            pq.add(ele);
        }
        for (int i = 1; i < k; i++) {//I want this loop will run only tree time so i can access the k=4 element
            pq.remove();
        }
        System.out.println(pq.peek());
    }
}
