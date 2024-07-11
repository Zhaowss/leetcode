/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] xx=new int[2];
        for(int i=0; i<nums.length;i++){
            map.put(nums[i],i);
        }
        for (int i = 0; i < nums.length; i++) {
            int value=target-nums[i];
            if(map.get(value) != null && map.get(value)!=i){
            xx[0]=i;
            xx[1]=map.get(value);
            }
        }
        return xx;

    }
}
// @lc code=end

