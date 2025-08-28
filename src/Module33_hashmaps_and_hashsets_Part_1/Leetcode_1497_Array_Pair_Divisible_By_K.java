package Module33_hashmaps_and_hashsets_Part_1;

import java.util.HashMap;

public class Leetcode_1497_Array_Pair_Divisible_By_K {
    public static boolean canArrange(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int ele = arr[i] % k;
            if (map.containsKey(ele)) {
                int freq = map.get(ele);
                map.put(ele, freq + 1);
            } else {
                map.put(ele, 1);
            }
        }

        for (int key : map.keySet()) {
            int rem = k - key;//5 - 1,2,3,4
            if (!map.containsKey(rem)) return false;
            int keyFreq = map.get(key);
            int remFreq = map.get(rem);
            if(keyFreq !=remFreq) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k = 5;
        canArrange(arr,k);

    }
}
