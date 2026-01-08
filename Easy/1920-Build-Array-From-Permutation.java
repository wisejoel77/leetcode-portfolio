// LeetCode 1920 - Build Array From Permutation
// Solved on: 7 January 2026 
// Approach: Direct Index Mapping
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
