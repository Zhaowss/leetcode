/*
 * @lc app=leetcode.cn id=18 lang=java
 *
 * [18] 四数之和
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<List<Integer>>();

        for (int index = 0; index < nums.length; index++) {

            if (nums[index]>0 && nums[index]>target) {
                return res;
            }

            if (index>0 &&nums[index]==nums[index-1]) {
                continue;
            }

            for (int i = index+1; i < nums.length; i++) {
                if (i>index+1 && nums[i]==nums[i-1]) {
                    continue;
                }
                int left=i+1;
                int right=nums.length-1;
                while (left<right) {
                    int sum=nums[index]+nums[i]+nums[right]+nums[left];
                    if (sum>target) {
                     right--;
                    }else if (sum<target) {
                      left++;   
                    }else{

                        res.add(new ArrayList<>(Arrays.asList(nums[index],nums[i],nums[left],nums[right])));

                        while (left<right && nums[left]==nums[left+1]) {
                            left++;
                        }

                        while (left<right && nums[right]==nums[right-1]) {
                            right--;
                        }

                        right--;
                        left++;
                    }
                }
                
            }
        }

        return res;

    }
}
// @lc code=end

