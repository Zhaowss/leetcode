/*
 * @lc app=leetcode.cn id=34 lang=java
 *
 * [34] 在排序数组中查找元素的第一个和最后一个位置
 */

// @lc code=start
class Solution {
    public int[] searchRange(int[] nums, int target) {

        // 有序数组处理 首先考虑二分的算法
        int[] arr=new int[2];
        int left=0; 
        int right=nums.length-1;
        if (nums.length==0) {
            arr[0]=-1;
            arr[1]=-1;
          return arr;
        }
        // 左闭右开
        while (left<=right) {
            
            int middle=left+(right-left)/2;

            if (nums[middle]>target) {
                right=middle-1;
            }else if (nums[middle]<target) {
                left=middle+1;     
            }else if (nums[middle]==target) {
                right=middle-1;
            }
        }

        if (left >= nums.length) {
            arr[0]=-1;
        }else{
            arr[0]= nums[left]==target? left:-1;
        }
       

        left=0; 
        right=nums.length-1;
        // 左闭右开
        while (left<=right) {
            
            int middle=left+(right-left)/2;

            if (nums[middle]>target) {
                right=middle-1;
            }else if (nums[middle]<target) {
                left=middle+1;     
            }else if (nums[middle]==target) {
                left=middle+1;
            }
        }
    
        if (right<0) {
            arr[1]=-1;
        }
        else{
            arr[1]= nums[right]==target? right:-1;
        }
    
    return arr;
    }
}
// @lc code=end

