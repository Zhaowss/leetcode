/*
 * @lc app=leetcode.cn id=15 lang=java
 *
 * [15] 三数之和
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>0) {
                return res;
            }
            if (i>0  && nums[i]==nums[i-1]) {
                continue;
            }
            int left=i+1;
            int right=nums.length-1;
            while (left<right) {
                int sum=nums[left]+nums[right]+nums[i];
                if (sum>0) {
                    right--;
                }else if (sum<0) {
                    left++;
                }else{
                res.add(new ArrayList<>(Arrays.asList(nums[i],nums[left],nums[right])));
                //添加完毕后进行a和b的去重
                while (left<right  &&  nums[left]==nums[left+1]) {
                    left++;
                }
                while (left<right  &&  nums[right]==nums[right-1]) {
                   right--;
                }

                left++;
                right--;
            }
            }
            
        }
        return res;
    }
}
// @lc code=end

