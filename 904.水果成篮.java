/*
 * @lc app=leetcode.cn id=904 lang=java
 *
 * [904] 水果成篮
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public int totalFruit(int[] fruits) {
        int left=0;
        int res=Integer.MIN_VALUE;
        HashMap<Integer,Integer> hashmap=new HashMap<Integer,Integer>();
        for (int right = 0; right < fruits.length; right++) {
            // 放入加入的类别和对应的次数
           hashmap.put(fruits[right], hashmap.getOrDefault(fruits[right],0)+1);

            
            //窗口收缩的条件
            while (hashmap.size()>2) {
                hashmap.put(fruits[left],hashmap.get(fruits[left])-1);
                if (hashmap.get(fruits[left])==0) {
                    hashmap.remove(fruits[left]);
                }
                left++;
            
            }
            res=Math.max(res, right-left+1);
         
        }
        return res;
    }
}
// @lc code=end

