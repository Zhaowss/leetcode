/*
 * @lc app=leetcode.cn id=704 lang=java
 *
 * [704] 二分查找
 */

// @lc code=start
// class Solution {
//     public int search(int[] nums, int target) { 
//     int left=0;
//     int right=nums.length;
//     int res=-1;
//     // 二分法遵循的循环不变，即也就是左闭右开则一直保持左闭合右开的。
//     while (right>left) {
//         int mid=(right+left)>>1;
//         if (nums[mid]>target) {
//             right=mid;
//         }
//         else if(nums[mid]<target){
//             left=mid+1;
//         }else{
//             if (nums[mid]==target) {
//                 res=mid;
//                 break;   
//             }
           
//         }
//     }
//     return res;
//     }
// }

// 左边闭合 右边闭合
// class Solution {
//     public int search(int[] nums, int target) { 
//     int left=0;
//     int right=nums.length-1;
//     int res=-1;
//     // 二分法遵循的循环不变，即也就是左闭右开则一直保持左闭合右开的。
//     while (left<=right) {
//         int mid=(right+left)>>1;
//         if (nums[mid]>target) {
//             right=mid-1;
//         }
//         else if(nums[mid]<target){
//             left=mid+1;
//         }else{
//             if (nums[mid]==target) {
//                 res=mid;
//                 break;   
//             }
           
//         }
//     }
//     return res;
//     }
// }

// 左闭右开

class Solution {
    public int search(int[] nums, int target) { 
    int left=0;
    int right=nums.length;
    int res=-1;

    // 二分法遵循的循环不变，即也就是左闭右开则一直保持左闭合右开的。
    while (left<right) {
        // 不包含右边的边界的情况下
        int mid=(right+left)>>1;
        if (nums[mid]>target) {
            right=mid;
            // 这里设定右边的边界为mid,其实是已经排除了mid的部分
        }
        else if(nums[mid]<target){
            left=mid+1;
            // 这里要考虑到采用左闭合右开的操作的话，就需要将其mid排除在外
        }else{
            if (nums[mid]==target) {
                res=mid;
                break;   
            }
           
        }
    }
    return res;
    }
}



// @lc code=end

