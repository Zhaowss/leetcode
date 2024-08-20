/*
 * @lc app=leetcode.cn id=34 lang=java
 *
 * [34] 在排序数组中查找元素的第一个和最后一个位置
 */

// @lc code=start
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left=0;
        int right=nums.length;
        int left_edge=-1;
        int right_edge=-1;
        while (left<right) {
            int mid=(left+right)>>1;
            if (nums[mid]==target) {
                right=mid;
                left_edge=right;
            }else if (nums[mid]>target) {
                right=mid;
            }else{
                left=mid+1;
            }
        }
        int left1=0;
        int right1=nums.length;
        while (left1<right1) {
            int mid=(left1+right1)>>1;
            if (nums[mid]==target) {
                left1=mid+1;
                right_edge=left1;
            }else if (nums[mid]<target) {
                left1=mid+1;
            }else{
                right1=mid;    
            }
        }
        if (right_edge!=-1) {
            right_edge--;
        }

        return new int[]{left_edge,right_edge};

    }
}
// @lc code=end

