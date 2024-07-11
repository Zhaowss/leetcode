/*
 * @lc app=leetcode.cn id=4 lang=java
 *
 * [4] 寻找两个正序数组的中位数
 */

// @lc code=start
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
 
        // 先排序
        int m=nums1.length;
        int n=nums2.length;
        int[] arr=new int[m+n];
        
    }

    }


    public static void swap(int[] arr,int i ,int j){
        arr[i]=arr[i]^arr[j];
        arr[j]=arr[i]^arr[j];
        arr[i]=arr[i]^arr[j];
    }

// @lc code=end

