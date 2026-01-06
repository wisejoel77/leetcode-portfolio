// LeetCode 0001 - Two Sum
// Solved on: 2 January 2026 
// Approach: Brute Force using nested loops
// Time Complexity: O(n^2)
// Space Complexity: O(1)

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                int sum = nums[i] + nums[j];
                if(sum == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {};
    }
}
