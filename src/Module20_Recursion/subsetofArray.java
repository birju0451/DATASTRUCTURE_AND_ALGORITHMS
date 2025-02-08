package Module20_Recursion;

import java.util.*;

public class subsetofArray {
    static List<List<Integer>> arr;

    public void makesubset(int i, int[] nums, ArrayList<Integer> ans) {
        if (i == nums.length) {
            arr.add(new ArrayList<>(ans)); // Directly add a copy of ans
            return;
        }

        // Exclude the current element
        makesubset(i + 1, nums, ans);

        // Include the current element
        ;
        System.out.println("include"+ans.add(nums[i]));
        makesubset(i + 1, nums, ans);

        // Backtrack to remove the last added element

        System.out.println("remove"+ans.remove(ans.size() - 1));
    }

    public List<List<Integer>> subsets(int[] nums) {
        arr = new ArrayList<>();
        makesubset(0, nums, new ArrayList<>());
        return arr;
    }

    public static void main(String[] args) {
        subsetofArray solution = new subsetofArray();
        int[] nums = {1, 2, 3}; // Example input
        List<List<Integer>> result = solution.subsets(nums);

        System.out.println("Subsets:");
        for (List<Integer> subset : result) {
            System.out.println(subset);
        }
    }
}
