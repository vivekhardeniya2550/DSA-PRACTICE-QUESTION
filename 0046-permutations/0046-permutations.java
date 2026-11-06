 import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums, new boolean[nums.length]);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> current, int[] nums, boolean[] used) {
        // Base case: if the current permutation is of the same length as nums
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue; // Skip if already used in the current path

            // Choose
            used[i] = true;
            current.add(nums[i]);

            // Explore
            backtrack(result, current, nums, used);

            // Un-choose (Backtrack)
            current.remove(current.size() - 1);
            used[i] = false;
        }
    }
}