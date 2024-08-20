/*
 * @lc app=leetcode.cn id=3 lang=java
 *
 * [3] 无重复字符的最长子串
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
       HashMap<Character,Integer> hs= new HashMap<>();
       int left=0,res=0;

       for (int right = 0; right <s.length(); right++) {
        //添加元素
        hs.put(s.charAt(right), hs.getOrDefault(s.charAt(right), 0)+1);

        while (hs.get(s.charAt(right))>1) {
            hs.put(s.charAt(left), hs.get(s.charAt(left))-1);
            left++;
        }

        res=Math.max(res, right-left+1);
        
       }
        return res;

       
    }
}
// @lc code=end

