/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer> hashMap=new HashMap<>();
    //   将其每个元素及其下标存入；
       for (int i = 0; i < nums.length; i++) {
        hashMap.put(nums[i], i);
       }
       for (int i = 0; i < nums.length; i++) {
        if (hashMap.containsKey(target-nums[i]) && i!=hashMap.get(target-nums[i])) {
            return new int[]{i,hashMap.get(target-nums[i])};
        }
       }
       return new int[]{};

    }
}
// @lc code=end

