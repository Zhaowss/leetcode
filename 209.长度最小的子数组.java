/*
 * @lc app=leetcode.cn id=209 lang=java
 *
 * [209] 长度最小的子数组
 */

// @lc code=start
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
    //  字串子序列可以考虑使用我们的滑动窗口；

    int right=0;
    int left=0;
    int min_len=Integer.MAX_VALUE;
    int sum=0;
    while (right<nums.length) {
        sum+=nums[right];
        while (sum>=target) {
        min_len=Math.min(min_len,right-left+1);
        sum=sum-nums[left];
        left++;
        }  
    } 
    return min_len;
}
    
 }
// @lc code=end

