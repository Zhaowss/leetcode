/*
 * @lc app=leetcode.cn id=977 lang=java
 *
 * [977] 有序数组的平方
 */

// @lc code=start
class Solution {
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
                nums[i]=nums[i]*nums[i];
        }
        sort(nums);
        return nums;      
    }
    void sort(int[] nums){
       for (int i = 0; i < nums.length; i++) {
        int maxindex=i;
        for (int j = i+1; j < nums.length; j++) {
        maxindex=nums[j]>nums[maxindex]? j:maxindex;   
        swap(nums,maxindex,j);
        }       
       }     
    }

    void swap(int [] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
 

}
// @lc code=end

