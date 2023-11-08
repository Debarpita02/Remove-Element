class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // Initialize a variable to count non-val elements
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; // Move non-val elements to the beginning of the array
                k++; // Increment the count of non-val elements
            }
        }
        
        return k;
    }
}
