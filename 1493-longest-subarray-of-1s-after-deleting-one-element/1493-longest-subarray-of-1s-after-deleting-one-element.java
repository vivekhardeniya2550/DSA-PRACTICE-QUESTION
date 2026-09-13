 class Solution {
    public int longestSubarray(int[] nums) {
        int max = 0;
        int s = 0, e = 0;
        int z = 0;

        while (e < nums.length) {
            if (nums[e] == 0)
                z++;

            while (z > 1) {
                if (nums[s] == 0)
                    z--;

                s++;
            }

            int size = e - s;   // delete one element
            max = Math.max(max, size);

            e++;
        }

        return max;
    }
}