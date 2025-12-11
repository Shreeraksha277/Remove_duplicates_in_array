class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0; // Points to last unique element
        
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1; // Number of unique elements
    }
}
