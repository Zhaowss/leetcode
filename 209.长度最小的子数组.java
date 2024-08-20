/*
 * @lc app=leetcode.cn id=209 lang=java
 *
 * [209] 长度最小的子数组
 */

// @lc code=start
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int sum=0;
        int res=Integer.MAX_VALUE;

        for (int right= 0; right < nums.length; right++) {
            //窗口的右边，不断向右前行
            sum+=nums[right];
            //如果当前的n个元素的和大于这个target的时候。
            // 开始进行窗口的自旋，左边界收缩。
           while (sum>=target) {
             res=Math.min(res, right-left+1);
             sum -= nums[left++];
           }
        }
        return res==Integer.MAX_VALUE?0:res;
}
    
 }
// @lc code=end

