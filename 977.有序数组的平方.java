/*
 * @lc app=leetcode.cn id=977 lang=java
 *
 * [977] 有序数组的平方
 */

// @lc code=start
class Solution {

    public int[] sortedSquares(int[] nums) {
    
      int[] res=new int[nums.length];

      int left=0;
      int right=nums.length-1;
      int count=nums.length-1;
      while (left<=right) {
        if (Math.abs(nums[left])>Math.abs(nums[right])) {
            res[count--]=nums[left]*nums[left];
            left++;
        }else if (Math.abs(nums[left])<=Math.abs(nums[right])) {
             res[count--]=nums[right]*nums[right];
             right--;
        }
      }
      return res;

    }

}
// @lc code=end
 
