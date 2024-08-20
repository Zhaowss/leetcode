/*
 * @lc app=leetcode.cn id=167 lang=java
 *
 * [167] 两数之和 II - 输入有序数组
 */

// @lc code=start

import java.util.ArrayList;
import java.util.HashMap;

class Solution {

    public int[] twoSum(int[] numbers, int target) {
       HashMap<Integer,Integer> hashMap=new HashMap<>();
       for (int i = 0; i < numbers.length; i++) {
        hashMap.put(numbers[i], i);
       }
        for (int i = 0; i < numbers.length; i++) {
             if (hashMap.containsKey(target-numbers[i])&& i!=hashMap.get(target-numbers[i])) {
                return new int[]{i+1,hashMap.get(target-numbers[i])+1};
             }
        }
        return new int[]{};

    }
}
// @lc code=end

