package Module37_Sliding_Window;
import java.util.HashMap;
import java.util.Map;

public class Leetcode_904_Fruit_Into_Baskets {
    public int totalFruit(int[] arr) {
        int n = arr.length, i = 0, j = 0, maxLen = 0;
        Map<Integer, Integer> map = new HashMap<>();

        while (j < n) {
            if (map.containsKey(arr[j])) {
                map.put(arr[j], map.get(arr[j]) + 1);
            } else {
                map.put(arr[j], 1);
            }

            // shrink window if > 2 fruit types
            while (map.size() > 2) {
                int freq = map.get(arr[i]);
                if (freq == 1)
                    map.remove(arr[i]);
                else
                    map.put(arr[i], freq - 1);
                i++;
            }

            int len = j - i + 1;
            maxLen = Math.max(maxLen, len);
            j++;
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] fruits = {1,2,3,2,2};

    }
}


