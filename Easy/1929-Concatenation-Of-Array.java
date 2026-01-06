// LeetCode 1929 - Concatenation of Array
// Solved on: 6 January 2026
// Approach: Create a new array and copy elements twice
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2*nums.length];
        for(int i=0; i<nums.length; i++){
            ans[i] = nums[i];
            ans[i+nums.length] = nums[i];
        }
        return ans;
    }
}
