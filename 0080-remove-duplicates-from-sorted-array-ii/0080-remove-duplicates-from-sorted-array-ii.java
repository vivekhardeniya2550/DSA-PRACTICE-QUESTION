class Solution {
    public int removeDuplicates(int[] nums) {
        // If the array has 2 or fewer elements, no duplicates need to be removed.
        if (nums.length <= 2) {
            return nums.length;
        }
        
        // Start writing from index 2, since the first two elements are always valid.
        int i = 2;
        
        for (int j = 2; j < nums.length; j++) {
            // If the current element is different from the element 2 positions back, 
            // it means we haven't exceeded the limit of 2 occurrences.
            if (nums[j] != nums[i - 2]) {
                nums[i] = nums[j];
                i++;
            }
        }
        
        return i;
    }
}