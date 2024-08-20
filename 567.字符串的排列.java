/*
 * @lc app=leetcode.cn id=567 lang=java
 *
 * [567] 字符串的排列
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        // 首先分析此意，其实就是说S1是s2的子字符串
       char[] str1= s1.toCharArray();
       char[] str2= s2.toCharArray();
       HashMap<Character,Integer> need=new HashMap<>();
       HashMap<Character,Integer> window=new HashMap<>();
       for (char c : str1) {
        need.put(c, need.getOrDefault(c, 0)+1);
       }
       int left=0;//左指针
       int falg=0;

       for (int right = 0; right < str2.length; right++) {


        if (need.containsKey(str2[right])) {
            window.put(str2[right], window.getOrDefault(str2[right], 0)+1);
            if (window.get(str2[right]).equals(need.get(str2[right]))) {
                falg++;
            }
        }
        // 此时窗口满足条件
        while (falg==need.size()) {

            if (right-left+1==s1.length()) {
                return true;
            }
            if (need.containsKey(str2[left])) {

                if (need.get(str2[left]).equals(window.get(str2[left]))) {
                    falg--;
                }

                window.put(str2[left], window.get(str2[left])-1);
              
            }
            left++;  
        }
       }
       return false;

    }
}
// @lc code=end

