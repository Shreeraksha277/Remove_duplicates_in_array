class Solution {
    public int removeDuplicates(int[] nums) {
        int i=1 // First element is always unique
        
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i ; // Number of unique elements
    }
}
