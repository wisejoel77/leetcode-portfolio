// LeetCode 1920 - Running Sum Of 1d Array
// Solved on: 7 January 2026 
// Approach: Prefix Sum (In-place)
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum = sum + nums[i];
            nums[i] = sum;
        }
        return nums;
    }
}
