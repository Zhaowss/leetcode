/*
 * @lc app=leetcode.cn id=454 lang=java
 *
 * [454] 四数相加 II
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {

        HashMap<Integer,Integer> hashMap=new HashMap();
        for (int i : nums1) {
            for (int j : nums2) {
                hashMap.put(i+j,hashMap.getOrDefault(i+j, 0)+1);
            }
        }

        int count=0;
        // 记录其等于a+b+c+d=0 的个数
        // 和两数之和类似，我们只需哟判断是否存在（0-c-d）是否在map中存在
        //如果存在将其次数叠加到count中

        for (int i : nums3) {
            for (int j : nums4) {
                if (hashMap.containsKey(0-(i+j))) {
                    count+=hashMap.get(0-(i+j));
                }
            }
        }

        return count;

    }
}
// @lc code=end

