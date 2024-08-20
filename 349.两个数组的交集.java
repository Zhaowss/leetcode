/*
 * @lc app=leetcode.cn id=349 lang=java
 *
 * [349] 两个数组的交集
 */

// @lc code=start

import java.util.HashSet;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       HashSet<Integer> tae=new HashSet<Integer>();
       for (int i = 0; i < nums1.length; i++) {
               tae.add(nums1[i]); 
       }

      HashSet<Integer> res=new HashSet<>();
       for (int i = 0; i < nums2.length; i++) {
            if (tae.contains(nums2[i])) {
                res.add(nums2[i]);
            }
       }

       int[] arr=new int[res.size()];
       int i=0;
       for(Object ss:res.toArray()){
        arr[i++]=(int) ss;
       };
       return arr;
    }
}
// @lc code=end

