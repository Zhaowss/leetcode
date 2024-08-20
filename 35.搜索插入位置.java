/*
 * @lc app=leetcode.cn id=35 lang=java
 *
 * [35] 搜索插入位置
 */

// @lc code=start
// class Solution {
//     public int searchInsert(int[] nums, int target) {
//         int  left=0;
//         int right=nums.length;
//         // 属于左闭合右开的区间的时候
         
//     //    设定条件为左闭合右开
//        while(left<right){
//         int middle=left+(right-left)/2;
//         if(nums[middle]==target){
//             right=middle;
//         }else if(nums[middle]<target){
//             left=middle+1;
//             // 因为是左闭合右边开的情况所以其就是不能包含以及判定结束的边界，
//         }else if(nums[middle]>target){
//             // 左闭合右边开，则说明可以设置right为middle因为他也不会遍历到这个边界
//             right=middle;
//         }
//     }
//     return left;
//     }
// }



class Solution {
    public int searchInsert(int[] nums, int target) {
     int left=0;
     int right=nums.length;
     int res=-1;
     while (left<right) {
        int mid=(left+right)>>1;
        if (nums[mid]==target) {
            return mid;
        }else if (nums[mid]>target) {
          right=mid;  
        }else{
          left=mid+1;
        }
     }
     return left;
    }
}
// @lc code=end

