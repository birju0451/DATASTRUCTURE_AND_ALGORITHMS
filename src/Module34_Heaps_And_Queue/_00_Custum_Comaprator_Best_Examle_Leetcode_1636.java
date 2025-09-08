package Module34_Heaps_And_Queue;

import java.util.HashMap;
import java.util.PriorityQueue;

public class _00_Custum_Comaprator_Best_Examle_Leetcode_1636 {
    public static class Pair implements Comparable<Pair> {
        int ele;
        int freq;

        Pair(int ele, int freq) {
            this.ele = ele;
            this.freq = freq;
        }

        @Override
        public int compareTo(Pair p) {
            if (this.freq == p.freq) {
                return p.ele - this.ele; // larger element first if freq equal
            }
            return this.freq - p.freq; // smaller frequency first
        }
    }

    public int[] frequencySort(int[] nums) {
        // Step 1: Count frequencies
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int key : nums) {
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        // Step 2: Use PriorityQueue with custom sorting
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for (int key : map.keySet()) {
            pq.add(new Pair(key, map.get(key)));
        }

        // Step 3: Build the result
        int[] res = new int[nums.length];
        int idx = 0;
        while (!pq.isEmpty()) {
            Pair p = pq.poll();
            for (int i = 0; i < p.freq; i++) {
                res[idx++] = p.ele;
            }
        }
        return res;
    }

    // Main function for testing
    public static void main(String[] args) {
        _00_Custum_Comaprator_Best_Examle_Leetcode_1636 sol =
                new _00_Custum_Comaprator_Best_Examle_Leetcode_1636();
        int[] nums = {2, 3, 1, 3, 2, 2, 4};

        int[] sorted = sol.frequencySort(nums);

        System.out.println("Sorted by frequency:");
        for (int x : sorted) {
            System.out.print(x + " ");
        }
    }
}
