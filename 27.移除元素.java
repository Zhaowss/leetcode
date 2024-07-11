/*
 * @lc app=leetcode.cn id=27 lang=java
 *
 * [27] 移除元素
 */

// @lc code=start
// 使用快慢指针实现元素的删除 在数组中
class Solution {
    public int removeElement(int[] nums, int val) {
       int fast=0;
       int slow=0;
       for (int i = 0; i < nums.length; i++) {
         if (nums[fast]!=val) {
         nums[slow++]=nums[fast++];
         }else{
            fast++;
         }
       }
       return slow;

    }
}
// @lc code=end

