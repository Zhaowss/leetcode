/*
 * @lc app=leetcode.cn id=3 lang=java
 *
 * [3] 无重复字符的最长子串
 */

// @lc code=start

import java.util.HashMap;


class Solution {
    public int lengthOfLongestSubstring(String s) {

        int right=0,left=0,max=0;
        HashMap<Character,Integer> myarr=new HashMap<>();
        while (right<s.length()) {
            //
            char a=s.charAt(right);
            right++;
            myarr.put(a, myarr.getOrDefault(a, 0)+1);
            while(myarr.get(a)>1){

                char d=s.charAt(left);
                left++;

                if (myarr.containsKey(d)) {
                    myarr.put(d,myarr.getOrDefault(d, 0)-1);
                }
            }
            
            max=Math.max(max, right-left);
            // 寻找可行解
           
        }
        return max;

    }
}
// @lc code=end

